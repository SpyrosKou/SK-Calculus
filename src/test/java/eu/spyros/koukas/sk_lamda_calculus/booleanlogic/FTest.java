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
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.*;

import junit.framework.TestCase;

/**
 * Created at 2020-08-19
 *
 * @author Spyros Koukas
 */
public class FTest extends TestCase {

    public void testF() {
        assertEquals(F, F().apply(T).apply(F));
        assertEquals(T, F().apply(F).apply(T));
        assertEquals(K, F().apply(F).apply(K));
        assertEquals(S, F().apply(F).apply(S));
    }

    public void testFmethod() {
        assertEquals(F, F(T).apply(F));
        assertEquals(T, F(F).apply(T));
        assertEquals(K, F(F).apply(K));
        assertEquals(S, F(F).apply(S));
    }

    public void testApply() {
        assertEquals(F, F.apply(T).apply(F));
        assertEquals(T, F.apply(F).apply(T));
        assertEquals(K, F.apply(F).apply(K));
        assertEquals(S, F.apply(F).apply(S));
    }
    public void testEquals() {
        assertEquals(F, F());
        assertEquals(F(), F());

        assertEquals(F(), F(T).apply(F));
        assertEquals(F(), F(F).apply(F));

        assertFalse(F.equals(T()));
        assertFalse(F().equals(T()));

        assertFalse(F().equals(F(T).apply(T)));
        assertFalse(F().equals(F(F).apply(T)));
    }

    public void testHashCode() {
        assertEquals(F.hashCode(), F().hashCode());
        assertEquals(F().hashCode(), F().hashCode());

        assertEquals(F().hashCode(), F(T).apply(F).hashCode());
        assertEquals(F().hashCode(), F(F).apply(F).hashCode());
    }

    public void testToString() {
        final String expectedName = "F";
        assertEquals(expectedName, F.toString());
        assertEquals(expectedName, F().toString());
    }

    public void testSingleton() {
        assertSame(F, F());
    }
}