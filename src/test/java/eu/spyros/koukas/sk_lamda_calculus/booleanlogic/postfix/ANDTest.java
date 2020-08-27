package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix.AND.AND;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;

/**
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ANDTest extends TestCase {

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

    public void testANDmethod() {
        assertEquals(F, F().apply(F).apply(AND()));
        assertEquals(T, T().apply(T).apply(AND()));
        assertEquals(F, T().apply(F).apply(AND()));
        assertEquals(F, F().apply(T).apply(AND()));
    }

    public void testApply() {
        assertEquals(F, F.apply(F).apply(AND));
        assertEquals(T, T.apply(T).apply(AND));
        assertEquals(F, T.apply(F).apply(AND));
        assertEquals(F, F.apply(T).apply(AND));
    }

    public void testAND() {
        assertEquals(F, F().apply(F).apply(AND));
        assertEquals(T, T().apply(T).apply(AND));
        assertEquals(F, T().apply(F).apply(AND));
        assertEquals(F, F().apply(T).apply(AND));
    }

    public void testToString() {
        assertEquals(AND.toString(), AND.toString());
        assertEquals(AND.toString(), AND().toString());
    }

    public void testSingleton() {
        assertSame(AND, AND());
    }
}