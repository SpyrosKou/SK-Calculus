package eu.spyros.koukas.sk_lamda_calculus.primary;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * Created at 2020-08-06
 *
 * @author Spyros Koukas
 */
public class ITest extends TestCase {

    public void testPrint() {
        System.out.println(I(I(I(I(I(I))))));
        System.out.println(I(S));
        System.out.println(I(K));
    }

    public void testToString(){
        assertEquals(I(I(I(I(I(I))))).toString(),I.toString());
        assertEquals(I(S).toString(),S.toString());
        assertEquals(I(K).toString(),K.toString());
    }

    public void testApply() {
        assertEquals(I(I(I(I(I(I))))), I);
        assertEquals(I(S), S);
        assertEquals(I(K), K);
    }

    public void test_equals() {
        assertEquals(I, I);
        assertNotSame(I, K);
        assertNotSame(I, S);
    }


    public void test_hashcode() {
        assertEquals(I.hashCode(), I.hashCode());
        assertNotSame(I.hashCode(), K.hashCode());
        assertNotSame(I.hashCode(), S.hashCode());
    }
}