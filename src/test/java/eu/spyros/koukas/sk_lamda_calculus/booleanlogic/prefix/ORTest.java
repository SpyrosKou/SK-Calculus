package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix.OR.OR;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;

/**
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class ORTest extends TestCase {


    public void testORmethod() {
        assertEquals(F, OR().apply(F).apply(F));
        assertEquals(T, OR().apply(T).apply(T));
        assertEquals(T, OR().apply(T).apply(F));
        assertEquals(T, OR().apply(F).apply(T));
    }

    public void testApply() {
        assertEquals(F, OR.apply(F).apply(F));
        assertEquals(T, OR.apply(T).apply(T));
        assertEquals(T, OR.apply(T).apply(F));
        assertEquals(T, OR.apply(F).apply(T));
    }

    public void testOR() {
        assertEquals(F, OR(F).apply(F));
        assertEquals(T, OR(T).apply(T));
        assertEquals(T, OR(T).apply(F));
        assertEquals(T, OR(F).apply(T));
    }

    public void testToString() {
        assertEquals(OR.toString(), OR.toString());
        assertEquals(OR.toString(), OR().toString());
    }

    public void testSingleton() {
        assertSame(OR, OR());
    }
}