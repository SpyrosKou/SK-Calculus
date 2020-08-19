package eu.spyros.koukas.sk_lamda_calculus.primary;
/**
 * SK Calculus
 *     A SK Combinator Calculus written in Java
 *     https://github.com/SpyrosKou/SK-Calculus
 *     Copyright (C) 2020  Spyros Koukas
 *
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;

/**
 * The identity Lambda Combinator.
 * Always returns its argument.
 * Implemented in SK-Calculus as SKK.
 * While it is an optional combinator, it is included in the same package with {@link S} and {@link K} combinators.
 * This is because it is often included together with S and K combinators in SKI Combinator Calculus.
 * Created at 2020-08-01
 *
 * @author Spyros Koukas
 */
public final class I implements Term {
    private static final String NAME ="I";
    /**
     * A Singleton {@link I}
     */
    public static final I I=new I();

    /**
     * Hidden constructor
     */
    private I(){
    }


    /**
     * @param obj the reference object with which to compare.
     *
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     *
     * @see #hashCode()
     */
    @Override
    public boolean equals(final Object obj) {
        return obj != null && this.getClass().isInstance(obj);
    }



    /**
     *
     * @param term
     * @return
     */
    public static final  Term I(final Term term) {
        return S(K).apply(K).apply(term);
        //return term;
    }

    /**
     *
     * @return an instance of {@link I}
     */
    public static final  I I() {
        return I;
    }


    /**
     *
     * @param term
     * @return
     */
    @Override
    public Term apply(final Term term) {
        return I(term);
    }

    @Override
    public String toString() {
        return NAME;
    }
}