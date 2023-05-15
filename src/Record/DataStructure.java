package Record;

public sealed interface DataStructure permits Pair, Tuple {
    int SIZE = 0;
    default int getSize() {
        return SIZE;
    };
}
