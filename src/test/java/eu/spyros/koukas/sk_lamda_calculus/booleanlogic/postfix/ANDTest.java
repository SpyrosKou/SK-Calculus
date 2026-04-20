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
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix.AND.AND;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ANDTest {

    @Test
    public void testEquals() {
        assertEquals(AND, AND());
        assertEquals(AND(), AND);

        assertEquals(AND, F);
        assertEquals(AND, F());

        assertEquals(AND(), F);
        assertEquals(AND(), F());

        assertEquals(F, AND);
        assertEquals(F, AND());

        assertEquals(F(), AND);
        assertEquals(F(), AND());
    }

    @Test
    public void testANDmethod() {
        assertEquals(F, F().apply(F).apply(AND()));
        assertEquals(T, T().apply(T).apply(AND()));
        assertEquals(F, T().apply(F).apply(AND()));
        assertEquals(F, F().apply(T).apply(AND()));
    }

    @Test
    public void testApply() {
        assertEquals(F, F.apply(F).apply(AND));
        assertEquals(T, T.apply(T).apply(AND));
        assertEquals(F, T.apply(F).apply(AND));
        assertEquals(F, F.apply(T).apply(AND));
    }

    @Test
    public void testAND() {
        assertEquals(F, F().apply(F).apply(AND));
        assertEquals(T, T().apply(T).apply(AND));
        assertEquals(F, T().apply(F).apply(AND));
        assertEquals(F, F().apply(T).apply(AND));
    }

    @Test
    public void testToString() {
        assertEquals(AND.toString(), AND.toString());
        assertEquals(AND.toString(), AND().toString());
    }

    @Test
    public void testSingleton() {
        assertSame(AND, AND());
    }
}