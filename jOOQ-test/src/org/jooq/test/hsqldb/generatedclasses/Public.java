/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1560664464;

	/**
	 * The singleton instance of <code>PUBLIC</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("PUBLIC");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.hsqldb.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL,
			org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS,
			org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION,
			org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER,
			org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG,
			org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT,
			org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT,
			org.jooq.test.hsqldb.generatedclasses.tables.String.STRING,
			org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM,
			org.jooq.test.hsqldb.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785,
			org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937,
			org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.hsqldb.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.hsqldb.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.hsqldb.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.hsqldb.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.hsqldb.generatedclasses.tables.TUnsigned.T_UNSIGNED,
			org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.hsqldb.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
