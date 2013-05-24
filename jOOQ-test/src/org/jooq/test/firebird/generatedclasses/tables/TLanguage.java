/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1593090169;

	/**
	 * The singleton instance of <code>T_LANGUAGE</code>
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.firebird.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>T_LANGUAGE.CD</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2), this);

	/**
	 * The column <code>T_LANGUAGE.DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("DESCRIPTION_ENGLISH", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>T_LANGUAGE.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>T_LANGUAGE</code> table reference
	 */
	public TLanguage() {
		super("T_LANGUAGE", org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_LANGUAGE</code> table reference
	 */
	public TLanguage(java.lang.String alias) {
		super(alias, org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.firebird.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.firebird.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.firebird.generatedclasses.Keys.PK_T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.firebird.generatedclasses.tables.TLanguage as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.TLanguage(alias);
	}
}
