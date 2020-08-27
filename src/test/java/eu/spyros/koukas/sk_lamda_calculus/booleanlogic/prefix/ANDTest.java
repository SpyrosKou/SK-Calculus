package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix.AND.AND;

/**
 * Testing the prefix AND
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ANDTest extends TestCase {

    public void testANDmethod() {
        assertEquals(F, AND(F()).apply(F));
        assertEquals(T, AND(T()).apply(T));
        assertEquals(F, AND(T()).apply(F));
        assertEquals(F, AND(F()).apply(T));
    }

    public void testApply() {
        assertEquals(F, AND.apply(F).apply(F));
        assertEquals(T, AND.apply(T).apply(T));
        assertEquals(F, AND.apply(T).apply(F));
        assertEquals(F, AND.apply(F).apply(T));
    }

    public void testAND() {
        assertEquals(F, AND().apply(F()).apply(F));
        assertEquals(T, AND().apply(T()).apply(T));
        assertEquals(F, AND().apply(T()).apply(F));
        assertEquals(F, AND().apply(F()).apply(T));
    }

    public void testToString() {
        assertEquals(AND.toString(), AND.toString());
        assertEquals(AND.toString(), AND().toString());
    }

    public void testSingleton() {
        assertSame(AND, AND());
    }
}