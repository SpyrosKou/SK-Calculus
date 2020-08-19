package eu.spyros.koukas.sk_lamda_calculus.booleanlogic;

import eu.spyros.koukas.sk_lamda_calculus.primary.K;
import eu.spyros.koukas.sk_lamda_calculus.primary.S;
import eu.spyros.koukas.sk_lamda_calculus.primary.Term;

import static eu.spyros.koukas.sk_lamda_calculus.primary.K.K;

/**
 * The T combinator, which is a symbol for True in Boolean Logic.
 * T is equal to and implemented by {@link K}.
 * This class is useful for writing readable boolean logic in SK Calculus and printing clearer messages.
 * The {@link T#toString()}  returns "T" however since K is used to implement the {@link T}, after applying the first T, the methods of the implementing {@link S} and {@link K }would be returned.
 * Created at 2020-08-19
 *
 * @author Spyros Koukas
 */
public final class T implements Term {
    private static final String NAME = "T";

    private static final int HASHCODE = K.hashCode();
    /**
     * A singleton {@link T}
     */
    public static final T T = new T();

    /**
     * Hidden constructor
     */
    private T() {

    }

    /**
     * @return a hash code value for this object.
     *
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return HASHCODE;
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
    public boolean equals(final Object obj) {
        return obj != null && (this.getClass().isInstance(obj) || K.getClass().isInstance(obj));
    }


    /**
     * @param x
     *
     * @return
     */
    public final Term apply(final Term x) {
        return K.apply(x);
    }

    /**
     * @return an instance of {@link T}
     */
    public final T apply() {
        return T;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term T(final Term x) {
        return K.apply();
    }

    /**
     *
     * @return "T"
     */
    @Override
    public String toString() {
        return NAME;
    }

}