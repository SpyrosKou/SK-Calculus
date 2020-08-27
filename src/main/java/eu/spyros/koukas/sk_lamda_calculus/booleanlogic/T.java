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

/**
 * The T combinator, which is a symbol for True in Boolean Logic.
 * {@link T} is implemented by {@link K} but {@link T} and {@link K} are not equal (T.equals(K)==false and K.equals(T)==false).
 *
 * This class is useful for writing readable boolean logic in SK Calculus and printing clearer messages.
 * The {@link T#toString()}  returns "T" however since K is used to implement the {@link T}, after applying the first T, the methods of the implementing {@link S} and {@link K }would be returned.
 * Created at 2020-08-19
 *
 * @author Spyros Koukas
 */
public final class T extends K implements Term {
    private static final String NAME = "T";
    /**
     * A singleton {@link T}
     */
    public static final T T = new T();


    public static final Term T() {
        return T;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term T(final Term x) {
        return T.apply(x);
    }

    /**
     *
     * @return "T"
     */
    @Override
    public final String toString() {
        return NAME;
    }

}