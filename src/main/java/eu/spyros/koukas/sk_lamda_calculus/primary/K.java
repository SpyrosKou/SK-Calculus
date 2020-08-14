package eu.spyros.koukas.sk_lamda_calculus.primary;
/**
 * SK Calculus
 *     A SK Combinator Calculus written in Java
 *     https://github.com/SpyrosKou/SK-Calculus
 *     Copyright (C) 2020  Spyros Koukas
 *
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created at 2020-08-01
 *
 * @author Spyros Koukas
 */
public final class K implements Term {
    private static final String NAME = "K";
    private static final int HASHCODE = new Object().hashCode();
    /**
     * A singleton {@link K}
     */
    public static final K K = new K();

    /**
     * Hidden constructor
     */
    private K() {

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
        return obj != null && this.getClass().isInstance(obj);
    }


    /**
     * @param x
     *
     * @return
     */
    public final Term apply(final Term x) {
        return K(x);
    }

    /**
     * @return an instance of {@link K}
     */
    public final K apply() {
        return K;
    }

    /**
     * @param x
     *
     * @return
     */
    public static final Term K(final Term x) {
//        return (Term y) -> x;
        return new Kx(x);
    }

    @Override
    public String toString() {
        return NAME;
    }

    /**
     * Used to allow printing K(X)
     */
    private static final class Kx implements Term {

        private final Term x;

        @Override
        public boolean equals(final Object o) {
            if (this == o) {return true;}
            if (!(o instanceof Kx)) {return false;}
            final Kx kx = (Kx) o;
            return x.equals(kx.x);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x);
        }


        /**
         * Hidden constructor
         *
         * @param x
         */
        private Kx(final Term x) {
            this.x = x;
        }

        /**
         * Applies this function to the given argument.
         *
         * @param y the function argument
         *
         * @return {{@link Kx#x}}
         */
        @Override
        public Term apply(final Term y) {
            return this.x;
        }

        @Override
        public final String toString() {
            return K.NAME + "(" + this.x.toString() + ")";
        }
    }

}