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
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix.OR.OR;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;

/**
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ORTest extends TestCase {


    public void testORmethod() {
        assertEquals(F, OR().apply(F).apply(F));
        assertEquals(T, OR().apply(T).apply(T));
        assertEquals(T, OR().apply(T).apply(F));
        assertEquals(T, OR().apply(F).apply(T));
    }

    public void testApply() {
        assertEquals(F, OR.apply(F).apply(F));
        assertEquals(T, OR.apply(T).apply(T));
        assertEquals(T, OR.apply(T).apply(F));
        assertEquals(T, OR.apply(F).apply(T));
    }

    public void testOR() {
        assertEquals(F, OR(F).apply(F));
        assertEquals(T, OR(T).apply(T));
        assertEquals(T, OR(T).apply(F));
        assertEquals(T, OR(F).apply(T));
    }

    public void testToString() {
        assertEquals(OR.toString(), OR.toString());
        assertEquals(OR.toString(), OR().toString());
    }

    public void testSingleton() {
        assertSame(OR, OR());
    }
}