package Record;

/* Generic class that stores three objects of different types. This is not a record but is
 used to contrast with the Pair record and show how much boilerplate is reduced. */
public final class Tuple<T, U, V> implements DataStructure {

    private final T first;
    private final U second;
    private final V third;

    private static final int SIZE = 3;

    public Tuple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getSize() {
        return SIZE;
    }

    T getFirst() {
        return first;
    }

    U getSecond() {
        return second;
    }

    V getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + " + " + third + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Tuple<?, ?, ?> t)) return false;
        return t.first.equals(first) && t.second.equals(second) && t.third.equals(third);
    }
}