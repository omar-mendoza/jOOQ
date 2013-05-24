/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2084853210;

	/**
	 * The parameter <code>PUBLIC.P_ARRAYS3.IN_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * The parameter <code>PUBLIC.P_ARRAYS3.OUT_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String[]> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays3() {
		super("P_ARRAYS3", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.PArrays3.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public java.lang.String[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
