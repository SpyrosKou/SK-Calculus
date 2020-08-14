package eu.spyros.koukas.sk_lamda_calculus.primary;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * Created at 2020-08-10
 *
 * @author Spyros Koukas
 */
public class KTest extends TestCase {

    public void testPrint() {
        System.out.println(K(I).apply(I));//Renders "I"
        System.out.println(K(S));//Renders "K(S)"
        System.out.println(K(S).apply(I));//Renders "S"
        System.out.println(K(K));//Renders "K(K)"
    }

    public void testToString() {
        assertEquals(K(I).apply(I).toString(),I.toString());
        assertEquals(K(S).apply(I).toString(),S.toString());
        assertEquals(K(K).apply(I).toString(),K.toString());
    }

    public void testApply() {

        assertEquals(K(I).apply(I), I);
        assertEquals(K(I).apply(S), I);
        assertEquals(K(I).apply(K), I);

        assertEquals(K(S).apply(I), S);
        assertEquals(K(S).apply(S), S);
        assertEquals(K(S).apply(K), S);

        assertEquals(K(K).apply(I), K);
        assertEquals(K(K).apply(S), K);
        assertEquals(K(K).apply(K), K);
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
}