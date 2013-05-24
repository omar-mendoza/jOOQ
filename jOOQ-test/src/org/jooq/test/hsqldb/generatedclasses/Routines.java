/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in PUBLIC
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>PUBLIC.F317</code>
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.hsqldb.generatedclasses.routines.F317 f = new org.jooq.test.hsqldb.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_ARRAYS1</code>
	 */
	public static java.lang.Integer[] fArrays1(org.jooq.Configuration configuration, java.lang.Integer[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS1</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(java.lang.Integer[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS1</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer[]> fArrays1(org.jooq.Field<java.lang.Integer[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays1 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_ARRAYS2</code>
	 */
	public static java.lang.Long[] fArrays2(org.jooq.Configuration configuration, java.lang.Long[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS2</code> as a field
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(java.lang.Long[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS2</code> as a field
	 */
	public static org.jooq.Field<java.lang.Long[]> fArrays2(org.jooq.Field<java.lang.Long[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays2 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_ARRAYS3</code>
	 */
	public static java.lang.String[] fArrays3(org.jooq.Configuration configuration, java.lang.String[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS3</code> as a field
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(java.lang.String[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_ARRAYS3</code> as a field
	 */
	public static org.jooq.Field<java.lang.String[]> fArrays3(org.jooq.Field<java.lang.String[]> inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.FArrays3 f = new org.jooq.test.hsqldb.generatedclasses.routines.FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_AUTHOR_EXISTS</code>
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists f = new org.jooq.test.hsqldb.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_GET_ONE_CURSOR</code>
	 */
	public static org.jooq.Result<org.jooq.Record> fGetOneCursor(org.jooq.Configuration configuration, java.lang.Integer[] bookIds) {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_GET_ONE_CURSOR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(java.lang.Integer[] bookIds) {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_GET_ONE_CURSOR</code> as a field
	 */
	public static org.jooq.Field<org.jooq.Result<org.jooq.Record>> fGetOneCursor(org.jooq.Field<java.lang.Integer[]> bookIds) {
		org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor f = new org.jooq.test.hsqldb.generatedclasses.routines.FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_NUMBER</code>
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get <code>PUBLIC.F_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.hsqldb.generatedclasses.routines.FNumber f = new org.jooq.test.hsqldb.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.F_ONE</code>
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) {
		org.jooq.test.hsqldb.generatedclasses.routines.FOne f = new org.jooq.test.hsqldb.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>PUBLIC.F_ONE</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.hsqldb.generatedclasses.routines.FOne f = new org.jooq.test.hsqldb.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * Call <code>PUBLIC.P391</code>
	 */
	public static org.jooq.test.hsqldb.generatedclasses.routines.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer io2, java.lang.Integer i2) {
		org.jooq.test.hsqldb.generatedclasses.routines.P391 p = new org.jooq.test.hsqldb.generatedclasses.routines.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>PUBLIC.P_ARRAYS1</code>
	 */
	public static java.lang.Integer[] pArrays1(org.jooq.Configuration configuration, java.lang.Integer[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.PArrays1 p = new org.jooq.test.hsqldb.generatedclasses.routines.PArrays1();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>PUBLIC.P_ARRAYS2</code>
	 */
	public static java.lang.Long[] pArrays2(org.jooq.Configuration configuration, java.lang.Long[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.PArrays2 p = new org.jooq.test.hsqldb.generatedclasses.routines.PArrays2();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>PUBLIC.P_ARRAYS3</code>
	 */
	public static java.lang.String[] pArrays3(org.jooq.Configuration configuration, java.lang.String[] inArray) {
		org.jooq.test.hsqldb.generatedclasses.routines.PArrays3 p = new org.jooq.test.hsqldb.generatedclasses.routines.PArrays3();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>PUBLIC.P_AUTHOR_EXISTS</code>
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.hsqldb.generatedclasses.routines.PAuthorExists p = new org.jooq.test.hsqldb.generatedclasses.routines.PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call <code>PUBLIC.P_CREATE_AUTHOR</code>
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) {
		org.jooq.test.hsqldb.generatedclasses.routines.PCreateAuthor p = new org.jooq.test.hsqldb.generatedclasses.routines.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call <code>PUBLIC.P_CREATE_AUTHOR_BY_NAME</code>
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) {
		org.jooq.test.hsqldb.generatedclasses.routines.PCreateAuthorByName p = new org.jooq.test.hsqldb.generatedclasses.routines.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call <code>PUBLIC.P_UNUSED</code>
	 */
	public static org.jooq.test.hsqldb.generatedclasses.routines.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Integer out2) {
		org.jooq.test.hsqldb.generatedclasses.routines.PUnused p = new org.jooq.test.hsqldb.generatedclasses.routines.PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}
}
