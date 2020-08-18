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

import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * Created at 2020-08-10
 *
 * @author Spyros Koukas
 */
public class IEquivalenceTest extends TestCase {

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