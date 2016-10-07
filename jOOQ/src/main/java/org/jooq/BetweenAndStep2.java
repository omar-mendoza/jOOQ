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
package org.jooq;

import javax.annotation.Generated;

/**
 * An intermediate DSL type for the construction of a <code>BETWEEN</code>
 * predicate.
 *
 * @author Lukas Eder
 */
@Generated("This class was generated using jOOQ-tools")
public interface BetweenAndStep2<T1, T2> {

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Field<T1> maxValue1, Field<T2> maxValue2);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(T1 maxValue1, T2 maxValue2);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Row2<T1, T2> maxValue);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Record2<T1, T2> maxValue);

}
