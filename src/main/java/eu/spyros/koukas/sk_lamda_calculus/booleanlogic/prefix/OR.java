package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.primary.I.I;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;
/**
 * The boolean logic OR function implemented as a prefix operator.
 *
 *
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public final class OR implements Term {
    private static final String NAME = "OR";
    /**
     * A singleton {@link OR}
     */
    public static final OR OR = new OR();

    /**
     * Hidden constructor
     */
    private OR() {

    }





    public static final Term OR() {
        return OR;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term OR(final Term x) {
        return OR.apply(x);
    }

    /**
     *
     * @return "OR"
     */
    @Override
    public final String toString() {
        return NAME;
    }

    /**
     * @param obj the reference object with which to compare.
     *
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     *
     * @see #hashCode()
     */
    @Override
    public final boolean equals(final Object obj) {
        return obj != null && (this.getClass().isInstance(obj));
    }

    /**
     * @return
     */
    @Override
    public final int hashCode() {
        return this.getClass().getSimpleName().hashCode();
    }

    /**
     * @param term
     *
     * @return
     */
    public final Term apply(final Term term) {

        //SI(KT)
        return
                (S(I).apply(K(T))).apply(term);
    }

}