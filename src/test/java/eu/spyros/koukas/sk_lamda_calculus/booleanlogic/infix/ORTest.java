package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.infix;

import junit.framework.TestCase;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.infix.OR.OR;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;

/**
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public class ORTest extends TestCase {

    public void testEquals() {
        assertEquals(OR, OR());
        assertEquals(OR(), OR);

        assertEquals(OR, K);
        assertEquals(OR, K());

        assertEquals(OR(), K);
        assertEquals(OR(), K());

        assertEquals(T, K);
        assertEquals(T, K());

        assertEquals(T(), K);
        assertEquals(T(), K());

        assertEquals(OR, T);
        assertEquals(OR, T());

        assertEquals(OR(), T);
        assertEquals(OR(), T());
    }

    public void testORmethod() {
        assertEquals(F, F(OR()).apply(F));
        assertEquals(T, T(OR()).apply(T));
        assertEquals(T, T(OR()).apply(F));
        assertEquals(T, F(OR()).apply(T));
    }

    public void testApply() {
        assertEquals(F, F.apply(OR).apply(F));
        assertEquals(T, T.apply(OR).apply(T));
        assertEquals(T, T.apply(OR).apply(F));
        assertEquals(T, F.apply(OR).apply(T));
    }

    public void testOR() {
        assertEquals(F, F(OR()).apply(F));
        assertEquals(T, T(OR()).apply(T));
        assertEquals(T, T(OR()).apply(F));
        assertEquals(T, F(OR()).apply(T));
    }

    public void testToString() {
        assertEquals(OR.toString(), OR.toString());
        assertEquals(OR.toString(), OR().toString());
    }

    public void testSingleton() {
        assertSame(OR, OR());
    }
}