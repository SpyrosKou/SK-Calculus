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
import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix.NOT.*;

/**
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public class NOTTest extends TestCase {


    public void testEquals() {
        assertEquals(NOT, NOT());
        assertEquals(NOT(), NOT());
    }

    public void testNOTmethod() {
        assertEquals(T, F(NOT()));
        assertEquals(F, T(NOT()));


    }

    public void testApply() {
        assertEquals(T, F(NOT));
        assertEquals(F, T(NOT));

    }

    public void testNOT() {
        assertEquals(T, F().apply(NOT));
        assertEquals(F, T().apply(NOT));
    }

    public void testToString() {
        assertEquals(NOT.toString(), NOT.toString());
        assertEquals(NOT.toString(), NOT().toString());

    }

    public void testSingleton() {
        assertSame(NOT, NOT());
    }
}