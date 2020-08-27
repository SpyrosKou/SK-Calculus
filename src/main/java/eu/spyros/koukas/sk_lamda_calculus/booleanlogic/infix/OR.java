package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.infix;

import eu.spyros.koukas.sk_lamda_calculus.primary.K;
import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.booleanlogic.T.T;

/**
 * The boolean logic OR function implemented as an infix operator.
 *
 *
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public final class OR extends K implements Term {
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

}