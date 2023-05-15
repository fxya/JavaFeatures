package Record;

// Generic record that stores two objects of different types
public record Pair <T, U> (T first, U second) implements DataStructure {

    private static final int SIZE = 2;

    public int getSize() {
        return SIZE;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}