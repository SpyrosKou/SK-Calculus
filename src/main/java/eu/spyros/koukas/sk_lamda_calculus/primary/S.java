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

/**
 * Created at 2020-08-01
 *
 * @author Spyros Koukas
 */
public final class S implements Term {
    private static final String NAME = "S";
    private static final int HASHCODE = new Object().hashCode();
    /**
     * A singleton {@link S}
     */
    public static final S S = new S();

    /**
     * Hidden constructor
     */
    private S() {

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
    public static final Term S(final Term x) {
//        return y ->
//                z -> (x.apply(y))
//                        .apply(y.apply(z));
        return new Sx(x);
    }

    /**
     * @return an instance of {@link S}
     */
    public static final S S() {
        return S;
    }


    /**
     * Applies this function to the given argument.
     *
     * @param term the function argument
     *
     * @return the function result
     */
    @Override
    public final Term apply(final Term term) {
        return S(term);
    }

    @Override
    public String toString() {
        return NAME;
    }

    /**
     * Used to allow printing S(X)
     */
    private static final class Sx implements Term {

        private final Term x;

        @Override
        public boolean equals(final Object o) {
            if (this == o) {return true;}
            if (!(o instanceof S.Sx)) {return false;}
            final S.Sx sx = (S.Sx) o;
            return x.equals(sx.x);
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
        private Sx(final Term x) {
            this.x = x;
        }

        /**
         * @param y
         *
         * @return
         */
        @Override
        public Term apply(final Term y) {
            return new Sxy(this, y);
        }

        @Override
        public final String toString() {
            return S.NAME + "(" + this.x.toString() + ")";
        }
    }

    /**
     * Used to allow printing S(X)(Y)
     */
    private static final class Sxy implements Term {

        private final Sx sx;
        private final Term y;

        @Override
        public boolean equals(Object o) {
            if (this == o) {return true;}
            if (!(o instanceof Sxy)) {return false;}
            final Sxy sxy = (Sxy) o;
            return sx.equals(sxy.sx) &&
                    y.equals(sxy.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(sx, y);
        }

        /**
         * @param sx
         * @param y
         */
        private Sxy(final Sx sx, final Term y) {
            this.sx = sx;
            this.y = y;
        }


        @Override
        public Term apply(final Term z) {
            return (sx.x.apply(z))
                    .apply(y.apply(z));

        }

        @Override
        public final String toString() {
            return this.sx.toString() + "(" + this.y.toString() + ")";
        }
    }
}