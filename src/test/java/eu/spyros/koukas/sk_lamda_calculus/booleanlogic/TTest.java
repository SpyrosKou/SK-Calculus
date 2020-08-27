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
import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;

/**
 * Created at 2020-08-19
 *
 * @author Spyros Koukas
 */
public class TTest extends TestCase {

    public void testHashCode() {
        assertEquals(T.hashCode(), T().hashCode());
        assertEquals(T().hashCode(), T().hashCode());

        assertEquals(T().hashCode(), T(T).apply(T).hashCode());
        assertEquals(T().hashCode(), T(T).apply(F).hashCode());
    }


    public void testEquals() {
        assertEquals(T, T());
        assertEquals(T(), T());

        assertEquals(T(), T(T).apply(T));
        assertEquals(T(), T(T).apply(F));

        assertFalse(F.equals(T()));
        assertFalse(F().equals(T()));

        assertFalse(F().equals(T(T).apply(T)));
        assertFalse(F().equals(T(T).apply(F)));
    }

    public void testTmethod() {
        assertEquals(T, T(T).apply(T));
        assertEquals(T, T(T).apply(F));
        assertEquals(F, T(F).apply(T));
        assertEquals(F, T(F).apply(F));

    }

    public void testApply() {
        assertEquals(T, T.apply(T).apply(T));
        assertEquals(T, T.apply(T).apply(F));
        assertEquals(F, T.apply(F).apply(T));
        assertEquals(F, T.apply(F).apply(F));
    }

    public void testT() {
        assertEquals(T, T().apply(T).apply(T));
        assertEquals(T, T().apply(T).apply(F));
        assertEquals(F, T().apply(F).apply(T));
        assertEquals(F, T().apply(F).apply(F));
    }

    public void testToString() {
        assertEquals(T.toString(), T(T).apply(F).toString());
        assertEquals(T.toString(), T(T).apply(T).toString());

        assertEquals(F.toString(), T(F).apply(F).toString());
        assertEquals(F.toString(), T(F).apply(T).toString());

        assertEquals(T.toString(), T().apply(T).apply(F).toString());
        assertEquals(T.toString(), T().apply(T).apply(T).toString());

        assertEquals(F.toString(), T().apply(F).apply(F).toString());
        assertEquals(F.toString(), T().apply(F).apply(T).toString());

        assertEquals(T().toString(), T(T).apply(F).toString());
        assertEquals(T().toString(), T(T).apply(T).toString());

        assertEquals(F().toString(), T(F).apply(F).toString());
        assertEquals(F().toString(), T(F).apply(T).toString());

        assertEquals(T().toString(), T().apply(T).apply(F).toString());
        assertEquals(T().toString(), T().apply(T).apply(T).toString());

        assertEquals(F().toString(), T().apply(F).apply(F).toString());
        assertEquals(F().toString(), T().apply(F).apply(T).toString());
    }

    public void testSingleton() {
        assertSame(T, T());
    }
}