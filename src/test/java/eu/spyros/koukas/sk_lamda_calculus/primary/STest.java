package eu.spyros.koukas.sk_lamda_calculus.primary;
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

import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * Created at 2020-08-06
 *
 * @author Spyros
 */
public class STest extends TestCase {

    public void testToString() {
        assertEquals("S", S.toString());
        assertEquals(I.toString(), S(I).apply(I).apply(I).toString());
        assertEquals(K.toString(), S(K).apply(S).apply(K).toString());
        assertEquals(K.toString(), S(K).apply(I).apply(K).toString());

        //SKK===I
        assertEquals(K.toString(),S(K).apply(K).apply(K).toString() );
        assertEquals(I.toString(),S(K).apply(K).apply(I).toString());
        assertEquals(S.toString(),S(K).apply(K).apply(S).toString());

        //SKS===I
        assertEquals(K.toString(),S(K).apply(S).apply(K).toString() );
        assertEquals(I.toString(),S(K).apply(S).apply(I).toString());
        assertEquals(S.toString(),S(K).apply(S).apply(S).toString());
    }

    /**
     * Not an actual test. Just prints some demo values
     */
    public void testPrint() {

        System.out.println(S(I));
        System.out.println(S(I).apply(I));
        System.out.println(S(I).apply(I).apply(I));

        System.out.println(S(K));
        System.out.println(S(K).apply(K));
        System.out.println(S(K).apply(K).apply(K));

        System.out.println(S(S));
        System.out.println(S(S).apply(S));
        System.out.println(S(S).apply(S).apply(S));
        System.out.println(S(S).apply(S).apply(S).apply(S));

        System.out.println(S(S));
        System.out.println(S(K).apply(S));
        System.out.println(S(K).apply(S));
        System.out.println(S(K).apply(S).apply(K));
        System.out.println(S(K).apply(S).apply(K).apply(S));
    }

    public void testApply() {

        assertEquals(I(I(I(I(I(I))))), I);
        assertEquals(I(S), S);
        assertEquals(I(K), K);
    }

    /**
     *
     */
    public void test_equals() {
        assertEquals(I, I);
        assertNotSame(I, K);
        assertNotSame(I, S);
    }

    /**
     *
     */
    public void test_hashcode() {
        assertEquals(I.hashCode(), I.hashCode());
        assertNotSame(I.hashCode(), K.hashCode());
        assertNotSame(I.hashCode(), S.hashCode());
    }

    public void testEffectiveIReplacement() {

        //SKK===I
        assertEquals(S(K).apply(K).apply(K),K );
        assertEquals(S(K).apply(K).apply(S),S );
        {
            final Term I=S(K).apply(K);
            assertEquals(I.apply(K),K );
            assertEquals(I.apply(S),S );
        }
        //SKS===I
        assertEquals(S(K).apply(S).apply(K),K );
        assertEquals(S(K).apply(S).apply(S),S );
        {
            final Term I=S(K).apply(S);
            assertEquals(I.apply(K),K );
            assertEquals(I.apply(S),S );
        }
    }
}