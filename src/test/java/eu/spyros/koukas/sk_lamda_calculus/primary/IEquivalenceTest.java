package eu.spyros.koukas.sk_lamda_calculus.primary;

import junit.framework.TestCase;

import java.util.IdentityHashMap;

import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
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