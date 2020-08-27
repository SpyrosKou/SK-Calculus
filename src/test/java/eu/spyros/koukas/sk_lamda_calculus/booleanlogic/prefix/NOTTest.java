package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix.NOT.NOT;

/**
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public class NOTTest extends TestCase {


    public void testEquals() {
        assertEquals(NOT, NOT());
        assertEquals(NOT(), NOT());
    }

    public void testNOTmethod() {
        assertEquals(T, NOT().apply(F));
        assertEquals(F, NOT().apply(T));
    }

    public void testApply() {
        assertEquals(T, NOT.apply(F));
        assertEquals(F, NOT.apply(T));

    }

    public void testNOT() {
        assertEquals(T, NOT(F));
        assertEquals(F, NOT(T));
    }

    public void testToString() {
        assertEquals(NOT.toString(), NOT.toString());
        assertEquals(NOT.toString(), NOT().toString());

    }

    public void testSingleton() {
        assertSame(NOT, NOT());
    }
}