/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Integer extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> {

	private static final long serialVersionUID = -1407899278;

	/**
	 * The singleton instance of <code>PUBLIC.INTEGER</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Integer INTEGER = new org.jooq.test.hsqldb.generatedclasses.tables.Integer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord.class;
	}

	/**
	 * The column <code>PUBLIC.INTEGER.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>PUBLIC.INTEGER</code> table reference
	 */
	public Integer() {
		super("INTEGER", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.INTEGER</code> table reference
	 */
	public Integer(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Integer as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Integer(alias);
	}
}
