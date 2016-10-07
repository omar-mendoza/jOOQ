/*
 * Copyright (c) 2009-2016, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import org.jooq.tools.jdbc.DefaultStatement;

/**
 * A proxy for a JDBC {@link PreparedStatement} that emulates the API of a
 * prepared statement, when in fact executing an ad-hoc {@link Statement}
 *
 * @author Lukas Eder
 */
final class SettingsEnabledPreparedStatement extends DefaultStatement implements PreparedStatement {

    private final Connection connection;
    private final MethodType methodType;
    private final String     sql;
    private int              autoGeneratedKeys;
    private int[]            columnIndexes;
    private String[]         columnNames;

    // ------------------------------------------------------------------------
    // XXX: Creation of PreparedStatements
    // ------------------------------------------------------------------------

    private SettingsEnabledPreparedStatement(Connection connection, String sql, MethodType type, Statement statement) {
        super(statement);

        this.connection = connection;
        this.methodType = type;
        this.sql = sql;
    }

    private SettingsEnabledPreparedStatement(Connection connection, String sql, MethodType type) throws SQLException {
        this(connection, sql, type, connection.createStatement());
    }

    SettingsEnabledPreparedStatement(Connection connection) throws SQLException {
        this(connection, null, MethodType.BATCH);
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql) throws SQLException {
        this(connection, sql, MethodType.SQL);
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        this(connection, sql, MethodType.SQL_RST_RSC, connection.createStatement(resultSetType, resultSetConcurrency));
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        this(connection, sql, MethodType.SQL_RST_RSC_RSH, connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql, int autoGeneratedKeys) throws SQLException {
        this(connection, sql, MethodType.SQL_AGK);

        this.autoGeneratedKeys = autoGeneratedKeys;
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql, int[] columnIndexes) throws SQLException {
        this(connection, sql, MethodType.SQL_CI);

        this.columnIndexes = columnIndexes;
    }

    SettingsEnabledPreparedStatement(Connection connection, String sql, String[] columnNames) throws SQLException {
        this(connection, sql, MethodType.SQL_CN);

        this.columnNames = columnNames;
    }

    // ------------------------------------------------------------------------
    // XXX: Utilities
    // ------------------------------------------------------------------------

    /**
     * A descriptor for the various methods that can create a prespared
     * statement
     */
    private static enum MethodType {

        /**
         * Corresponds to {@link Connection#prepareStatement(String)}
         */
        SQL,

        /**
         * Corresponds to {@link Connection#prepareStatement(String, int, int)}
         */
        SQL_RST_RSC,

        /**
         * Corresponds to
         * {@link Connection#prepareStatement(String, int, int, int)}
         */
        SQL_RST_RSC_RSH,

        /**
         * Corresponds to
         * {@link Connection#prepareStatement(String, int)}
         */
        SQL_AGK,

        /**
         * Corresponds to
         * {@link Connection#prepareStatement(String, int[])}
         */
        SQL_CI,

        /**
         * Corresponds to
         * {@link Connection#prepareStatement(String, String[])}
         */
        SQL_CN,

        /**
         * Corresponds to {@link Connection#createStatement()} and
         * {@link Statement#executeBatch()}
         */
        BATCH
    }

    @Override
    public final Connection getConnection() throws SQLException {
        return connection;
    }

    // ------------------------------------------------------------------------
    // XXX: Execute methods from java.sql.PreparedStatement
    // ------------------------------------------------------------------------

    @Override
    public final ResultSet executeQuery() throws SQLException {
        return getDelegate().executeQuery(sql);
    }

    @Override
    public final int executeUpdate() throws SQLException {
        switch (methodType) {
            case SQL_AGK:
                return getDelegate().executeUpdate(sql, autoGeneratedKeys);
            case SQL_CI:
                return getDelegate().executeUpdate(sql, columnIndexes);
            case SQL_CN:
                return getDelegate().executeUpdate(sql, columnNames);

            case SQL:
            case SQL_RST_RSC:
            case SQL_RST_RSC_RSH:
            default:
                return getDelegate().executeUpdate(sql);
        }
    }

    @Override
    public final boolean execute() throws SQLException {
        switch (methodType) {
            case SQL_AGK:
                return getDelegate().execute(sql, autoGeneratedKeys);
            case SQL_CI:
                return getDelegate().execute(sql, columnIndexes);
            case SQL_CN:
                return getDelegate().execute(sql, columnNames);

            case SQL:
            case SQL_RST_RSC:
            case SQL_RST_RSC_RSH:
            default:
                return getDelegate().execute(sql);
        }
    }

    // ------------------------------------------------------------------------
    // XXX: Supported and unsupported batch methods
    // ------------------------------------------------------------------------

    @Override
    public final void addBatch() throws SQLException {
        throw new UnsupportedOperationException("Cannot batch execute statements on PreparedStatementProxy");
    }

    // ------------------------------------------------------------------------
    // XXX: Unsupported bind variable methods from java.sql.PreparedStatement
    // ------------------------------------------------------------------------

    @Override
    public final ResultSetMetaData getMetaData() throws SQLException {
        throw new UnsupportedOperationException("Cannot fetch ResultSetMetaData early on PreparedStatementProxy");
    }

    @Override
    public final void clearParameters() throws SQLException {
        throw new UnsupportedOperationException("Cannot operate on bind values on a PreparedStatementProxy");
    }

    @Override
    public final ParameterMetaData getParameterMetaData() throws SQLException {
        throw new UnsupportedOperationException("Cannot operate on bind values on a PreparedStatementProxy");
    }

    @Override
    public final void setNull(int parameterIndex, int sqlType) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBoolean(int parameterIndex, boolean x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setByte(int parameterIndex, byte x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setShort(int parameterIndex, short x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setInt(int parameterIndex, int x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setLong(int parameterIndex, long x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setFloat(int parameterIndex, float x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setDouble(int parameterIndex, double x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setString(int parameterIndex, String x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBytes(int parameterIndex, byte[] x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setDate(int parameterIndex, Date x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setTime(int parameterIndex, Time x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setObject(int parameterIndex, Object x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setRef(int parameterIndex, Ref x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBlob(int parameterIndex, Blob x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setClob(int parameterIndex, Clob x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setArray(int parameterIndex, Array x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setURL(int parameterIndex, URL x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setRowId(int parameterIndex, RowId x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNString(int parameterIndex, String value) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNClob(int parameterIndex, NClob value) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setClob(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }

    @Override
    public final void setNClob(int parameterIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Cannot set a bind value on a PreparedStatementProxy");
    }
}
