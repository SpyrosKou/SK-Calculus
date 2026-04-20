package eu.spyros.koukas.sk_lamda_calculus.primary;

import java.util.Objects;

/**
 * The Iota Combinator (ι).
 * Applies its argument to the ({@link S} and ({@link K} combinators: ι x = x ({@link S} ({@link K}.
 *
 * It forms a single-combinator complete basis for combinatory logic,
 * from which S and K (and therefore all SK combinator expressions)
 * can be derived.
 *
 * Unlike the {@link I} combinator ({@link I} x = x), Iota is not an identity function.
 * However, self-application yields identity: ι ι = I.
 *
 * It is not part of the standard ({@link S}({@link K} basis. It is included for demonstration purposes.
 *
 * Created at 2026-04-20
 *
 * @author Spyros Koukas
 */
public final class Iota implements Term {

    public static final Iota IOTA = new Iota();

    private Iota() {
    }

    @Override
    public final Term apply(final Term x) {
        return x.apply(S.S).apply(K.K);
    }

    @Override
    public final String toString() {
        return "ι";
    }

    @Override
    public final boolean equals(final Object obj) {
        return obj instanceof Iota;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(Iota.class);
    }
}