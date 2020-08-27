package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;
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
import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.I.*;

/**
 * The boolean logic NOT function implemented as a prefix operator
 *
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public final class NOT implements Term {
    private static final String NAME = "NOT";
    /**
     * A singleton {@link NOT}
     */
    public static final NOT NOT = new NOT();

    /**
     * Hidden constructor
     */
    private NOT() {

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
    public final boolean equals(final Object obj) {
        return obj != null && (this.getClass().isInstance(obj));
    }

    /**
     * @return
     */
    @Override
    public final int hashCode() {
        return this.getClass().getSimpleName().hashCode();
    }

    /**
     * @param term
     *
     * @return
     */
    public final Term apply(final Term term) {

        //S(SI(KF))(KT)
        return
                (S(S(I).apply((K(F)))).apply((K(T)))).apply(term);
    }


    public static final Term NOT() {
        return NOT;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term NOT(final Term x) {
        return NOT.apply(x);
    }

    /**
     * @return "NOT"
     */
    @Override
    public String toString() {
        return NAME;
    }

}