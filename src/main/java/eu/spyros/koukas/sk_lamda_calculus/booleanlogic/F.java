package eu.spyros.koukas.sk_lamda_calculus.booleanlogic;
/**
 * SK Calculus
 * A SK Combinator Calculus written in Java
 * https://github.com/SpyrosKou/SK-Calculus
 * Copyright (C) 2020  Spyros Koukas
 * <p>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

import eu.spyros.koukas.sk_lamda_calculus.primary.K;
import eu.spyros.koukas.sk_lamda_calculus.primary.S;
import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * The F combinator, which is a symbol for False in Boolean Logic.
 * F is equal to and implemented by {@link S}{@link K}.
 *
 * This class is useful for writing readable boolean logic in SK Calculus and printing clearer messages.
 * The {@link F#toString()}  returns "F" however since F is implemented by SK, after applying the first argument the toString methods from the underlying S or K methods will be returned.
 * Since {@link T} is actually {@link K}, {@link T} is used, hence {@link T#toString()} is used instead of {@link K#toString()}.
 *
 * Created at 2020-08-19
 * @author Spyros Koukas
 */
public class F implements Term {
    private static final String NAME = "F";
    /**
     * A singleton {@link F}
     */
    public static final F F = new F();

    /**
     * constructor
     */
    protected F() {

    }


    /**
     *
     * @param obj the reference object with which to compare.
     *
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * As Is true for all non null objects that extend {@link F}
     * @see #hashCode()
     */
    @Override
    public final boolean equals(final Object obj) {
        return obj != null && F.getClass().isInstance(obj);
    }

    /**
     * All objects instances that extend this class shall have the same hashcode.
     * This in accordance to the {@link #equals(Object)} method implementation.
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
    public static final Term F(final Term term) {
        return F.apply(term);
    }

    /**
     * @return an instance of {@link F}
     */
    public static final F F() {
        return F;
    }


    /**
     * Applies this function to the given argument.
     *
     * @param term the function argument
     *
     * @return the function result
     */
    @Override
    public final Term apply(final Term term) {
        return S(K).apply(term);
    }

    @Override
    public String toString() {
        return NAME;
    }

}