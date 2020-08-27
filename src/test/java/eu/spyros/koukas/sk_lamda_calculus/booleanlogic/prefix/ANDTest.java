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
import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix.AND.AND;

/**
 * Testing the prefix AND
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ANDTest extends TestCase {

    public void testANDmethod() {
        assertEquals(F, AND(F()).apply(F));
        assertEquals(T, AND(T()).apply(T));
        assertEquals(F, AND(T()).apply(F));
        assertEquals(F, AND(F()).apply(T));
    }

    public void testApply() {
        assertEquals(F, AND.apply(F).apply(F));
        assertEquals(T, AND.apply(T).apply(T));
        assertEquals(F, AND.apply(T).apply(F));
        assertEquals(F, AND.apply(F).apply(T));
    }

    public void testAND() {
        assertEquals(F, AND().apply(F()).apply(F));
        assertEquals(T, AND().apply(T()).apply(T));
        assertEquals(F, AND().apply(T()).apply(F));
        assertEquals(F, AND().apply(F()).apply(T));
    }

    public void testToString() {
        assertEquals(AND.toString(), AND.toString());
        assertEquals(AND.toString(), AND().toString());
    }

    public void testSingleton() {
        assertSame(AND, AND());
    }
}