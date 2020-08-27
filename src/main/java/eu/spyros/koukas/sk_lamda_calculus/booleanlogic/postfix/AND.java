package eu.spyros.koukas.sk_lamda_calculus.booleanlogic.postfix;

import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

/**
 * The boolean logic AND function implemented as a postfix operator.
 *
 *
 *
 * Created at 2020-08-20
 *
 * @author Spyros Koukas
 */
public final class AND extends eu.spyros.koukas.sk_lamda_calculus.booleanlogic.F implements Term {
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
     *
     * @return "AND"
     */
    @Override
    public final String toString() {
        return NAME;
    }

}