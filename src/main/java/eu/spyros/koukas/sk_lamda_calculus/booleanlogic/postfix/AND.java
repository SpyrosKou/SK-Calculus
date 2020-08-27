package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix;
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

/**
 * The boolean logic AND function implemented as a postfix operator.
 *
 *
 *
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public final class AND extends eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F implements Term {
    private static final String NAME = "AND";
    /**
     * A singleton {@link AND}
     */
    public static final AND AND = new AND();

    /**
     * Hidden constructor
     */
    private AND() {
    }





    public static final Term AND() {
        return AND;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term AND(final Term x) {
        return AND.apply(x);
    }

    /**
     *
     * @return "AND"
     */
    @Override
    public final String toString() {
        return NAME;
    }

}