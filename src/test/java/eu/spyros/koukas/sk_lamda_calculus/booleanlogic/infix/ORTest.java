package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.infix;
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
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.infix.OR.OR;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;

/**
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public class ORTest extends TestCase {

    public void testEquals() {
        assertEquals(OR, OR());
        assertEquals(OR(), OR);

        assertEquals(OR, K);
        assertEquals(OR, K());

        assertEquals(OR(), K);
        assertEquals(OR(), K());

        assertEquals(T, K);
        assertEquals(T, K());

        assertEquals(T(), K);
        assertEquals(T(), K());

        assertEquals(OR, T);
        assertEquals(OR, T());

        assertEquals(OR(), T);
        assertEquals(OR(), T());
    }

    public void testORmethod() {
        assertEquals(F, F(OR()).apply(F));
        assertEquals(T, T(OR()).apply(T));
        assertEquals(T, T(OR()).apply(F));
        assertEquals(T, F(OR()).apply(T));
    }

    public void testApply() {
        assertEquals(F, F.apply(OR).apply(F));
        assertEquals(T, T.apply(OR).apply(T));
        assertEquals(T, T.apply(OR).apply(F));
        assertEquals(T, F.apply(OR).apply(T));
    }

    public void testOR() {
        assertEquals(F, F(OR()).apply(F));
        assertEquals(T, T(OR()).apply(T));
        assertEquals(T, T(OR()).apply(F));
        assertEquals(T, F(OR()).apply(T));
    }

    public void testToString() {
        assertEquals(OR.toString(), OR.toString());
        assertEquals(OR.toString(), OR().toString());
    }

    public void testSingleton() {
        assertSame(OR, OR());
    }
}