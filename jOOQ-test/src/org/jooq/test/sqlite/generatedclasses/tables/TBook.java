/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1691756422;

	/**
	 * The singleton instance of <code>t_book</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.sqlite.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>t_book.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.co_author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.DETAILS_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.TITLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), T_BOOK);

	/**
	 * The column <code>t_book.PUBLISHED_IN</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.LANGUAGE_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.CONTENT_TEXT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * The column <code>t_book.CONTENT_PDF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.LONGVARBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.sqlite.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.sqlite.generatedclasses.Keys.FK_T_BOOK_T_AUTHOR_2, org.jooq.test.sqlite.generatedclasses.Keys.FK_T_BOOK_T_AUTHOR_1, org.jooq.test.sqlite.generatedclasses.Keys.FK_T_BOOK_T_LANGUAGE_1);
	}
}
