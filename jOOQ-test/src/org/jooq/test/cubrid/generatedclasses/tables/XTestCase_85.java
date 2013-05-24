/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 1551659637;

	/**
	 * The singleton instance of <code>x_test_case_85</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.cubrid.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>x_test_case_85.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>x_test_case_85.x_unused_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>x_test_case_85.x_unused_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_85__FK_X_TEST_CASE_85);
	}
}
