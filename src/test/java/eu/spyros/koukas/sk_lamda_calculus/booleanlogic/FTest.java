package eu.spyros.koukas.sk_lamda_calculus.booleanlogic;

import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.*;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.*;
import junit.framework.TestCase;

/**
 * Created at 2020-08-19
 *
 * @author Spyros
 */
public class FTest extends TestCase {

    public void testF() {
    }

    public void testFmethod() {
        assertEquals(F, F(T).apply(F));
        assertEquals(T, F(F).apply(T));
        assertEquals(K, F(F).apply(K));
        assertEquals(S, F(F).apply(S));
    }

    public void testApply() {

    }

    public void testToString() {
    }
}