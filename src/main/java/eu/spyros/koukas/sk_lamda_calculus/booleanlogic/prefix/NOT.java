package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.prefix;

import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F.F;
import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;
import static eu.spyros.koukas.sk_lamda_calculus.primary.K.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.S.*;
import static eu.spyros.koukas.sk_lamda_calculus.primary.I.*;

/**
 * The boolean logic NOT function implemented as a prefix operator
 *
 * Created at 2020-08-27
 *
 * @author Spyros Koukas
 */
public final class NOT implements Term {
    private static final String NAME = "NOT";
    /**
     * A singleton {@link NOT}
     */
    public static final NOT NOT = new NOT();

    /**
     * Hidden constructor
     */
    private NOT() {

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

        //S(SI(KF))(KT)
        return
                (S(S(I).apply((K(F)))).apply((K(T)))).apply(term);
    }


    public static final Term NOT() {
        return NOT;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term NOT(final Term x) {
        return NOT.apply(x);
    }

    /**
     * @return "NOT"
     */
    @Override
    public String toString() {
        return NAME;
    }

}