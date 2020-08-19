package eu.spyros.koukas.sk_lamda_calculus.booleanlogic;
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
import eu.spyros.koukas.sk_lamda_calculus.primary.K;
import eu.spyros.koukas.sk_lamda_calculus.primary.S;
import eu.spyros.koukas.sk_lamda_calculus.primary.Term;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import java.util.Objects;

/**
 * The F combinator, which is a symbol for False in Boolean Logic.
 * F is equal to and implemented by {@link S}{@link K}.
 * This class is useful for writing readable boolean logic in SK Calculus and printing clearer messages.
 * The {@link F#toString()}  returns "F" however since F is implemented by SK, after applying the first argument the toString methods from the underlying S or K methods will be returned.
 * Created at 2020-08-19
 * @author Spyros Koukas
 */
public final class F implements Term {
    private static final String NAME = "F";
    /**
     * A singleton {@link F}
     */
    public static final F F = new F();

    /**
     * Hidden constructor
     */
    private F() {

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
     * @param x
     *
     * @return
     */
    public static final Term F(final Term x) {
        return S(K).apply(x);
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
        return F(term);
    }

    @Override
    public String toString() {
        return NAME;
    }

}