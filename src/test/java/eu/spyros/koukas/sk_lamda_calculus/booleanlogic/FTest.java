package eu.spyros.koukas.sk_lamda_calculus.booleanlogic;

import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.*;

import junit.framework.TestCase;

/**
 * Created at 2020-08-19
 *
 * @author Spyros Koukas
 */
public class FTest extends TestCase {

    public void testF() {
        assertEquals(F, F().apply(T).apply(F));
        assertEquals(T, F().apply(F).apply(T));
        assertEquals(K, F().apply(F).apply(K));
        assertEquals(S, F().apply(F).apply(S));
    }

    public void testFmethod() {
        assertEquals(F, F(T).apply(F));
        assertEquals(T, F(F).apply(T));
        assertEquals(K, F(F).apply(K));
        assertEquals(S, F(F).apply(S));
    }

    public void testApply() {
        assertEquals(F, F.apply(T).apply(F));
        assertEquals(T, F.apply(F).apply(T));
        assertEquals(K, F.apply(F).apply(K));
        assertEquals(S, F.apply(F).apply(S));
    }
    public void testEquals() {
        assertEquals(F, F());
        assertEquals(F(), F());

        assertEquals(F(), F(T).apply(F));
        assertEquals(F(), F(F).apply(F));

        assertFalse(F.equals(T()));
        assertFalse(F().equals(T()));

        assertFalse(F().equals(F(T).apply(T)));
        assertFalse(F().equals(F(F).apply(T)));
    }

    public void testHashCode() {
        assertEquals(F.hashCode(), F().hashCode());
        assertEquals(F().hashCode(), F().hashCode());

        assertEquals(F().hashCode(), F(T).apply(F).hashCode());
        assertEquals(F().hashCode(), F(F).apply(F).hashCode());
    }

    public void testToString() {
        final String expectedName = "F";
        assertEquals(expectedName, F.toString());
        assertEquals(expectedName, F().toString());
    }

    public void testSingleton() {
        assertSame(F, F());
    }
}