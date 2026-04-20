package eu.spyros.koukas.sk_lamda_calculus.primary;

import java.util.Objects;

final class TestTerms {

    static final Term A = new Atom("A");
    static final Term B = new Atom("B");
    static final Term C = new Atom("C");

    private TestTerms() {
    }

    static final class Atom implements Term {
        private final String name;

        Atom(final String name) {
            this.name = name;
        }

        @Override
        public final Term apply(final Term term) {
            return new Applied(this, term);
        }

        @Override
        public final String toString() {
            return this.name;
        }

        @Override
        public final boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Atom)) {
                return false;
            }
            final Atom other = (Atom) obj;
            return name.equals(other.name);
        }

        @Override
        public final int hashCode() {
            return name.hashCode();
        }
    }

    static final class Applied implements Term {
        private final Term left;
        private final Term right;

        Applied(final Term left, final Term right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public final Term apply(final Term term) {
            return new Applied(this, term);
        }

        @Override
        public final String toString() {
            return this.left + "(" + this.right + ")";
        }

        @Override
        public final boolean equals(final Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Applied)) {
                return false;
            }
            final Applied other = (Applied) obj;
            return this.left.equals(other.left) && this.right.equals(other.right);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(this.left, this.right);
        }
    }
}