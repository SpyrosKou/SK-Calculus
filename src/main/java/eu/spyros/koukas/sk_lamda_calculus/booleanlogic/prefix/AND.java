package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.S;

/**
 * The boolean logic AND function implemented as a prefix operator.
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public final class AND implements Term {
    private static final String NAME = "AND";
    /**
     * A singleton {@link AND}
     */
    public static final AND AND = new AND();

    /**
     * Hidden constructor
     */
    private AND() {
    }


    public static final Term AND() {
        return AND;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term AND(final Term x) {
        return AND.apply(x);
    }

    /**
     * @return "AND"
     */
    @Override
    public String toString() {
        return NAME;
    }

    /**
     * Applies this function to the given argument.
     *
     * @param term the function argument
     *
     * @return the function result
     */
    @Override
    public final Term apply(Term term) {
        //SS(K(KF))
        return S(S).apply(K((K(F)))).apply(term);
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
     *
     * @return
     */
    @Override
    public final int hashCode() {
        return this.getClass().getSimpleName().hashCode();
    }
}