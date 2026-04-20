package eu.spyros.koukas.sk_lamda_calculus.primary;

import org.junit.jupiter.api.Test;

import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
import static eu.spyros.koukas.sk_lamda_calculus.primary.Iota.IOTA;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;
import static eu.spyros.koukas.sk_lamda_calculus.primary.TestTerms.A;
import static eu.spyros.koukas.sk_lamda_calculus.primary.TestTerms.B;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class IotaTest {

    @Test
    public void singletonInstanceIsStable() {
        assertSame(IOTA, IOTA);
    }

    @Test
    public void iotaSatisfiesItsDefinition() {
        assertEquals(A.apply(S).apply(K), IOTA.apply(A));
        assertEquals(B.apply(S).apply(K), IOTA.apply(B));
    }

    @Test
    public void iotaAppliedToItselfBehavesAsIdentity() {
        final Term i = IOTA.apply(IOTA);

        assertEquals(A, i.apply(A));
        assertEquals(B, i.apply(B));
    }

    @Test
    public void iotaIotaAgreesWithI() {
        final Term i = IOTA.apply(IOTA);

        assertEquals(I.apply(A), i.apply(A));
        assertEquals(I.apply(B), i.apply(B));
    }
}