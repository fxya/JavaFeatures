import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecordTest {
    /* In practice you would probably use a record directly to store an address
     * instead of using a record to store a record. This is just an example.
     */
    private Pair<String, Tuple<String, String, String>> address;

    @BeforeEach
    public void setUp() {
         address = new Pair<>("Firtname Lastname",
                new Tuple<>("123 Main St", "New York", "NY"));
    }

    @Test
    public void creatingNewPair_returnsObjectWithSize2() {
        // getSize() is a default method implemented in Pair
        assert address.getSize() == 2;
    }

    @Test
    public void gettingFirstElementOfPair_returnsFirstElement() {
        // first() is not explicitly defined in Pair
        assert address.first().equals("Firtname Lastname");
    }

    @Test
    public void gettingSecondElementOfPair_returnsSecondElement() {
        // second() is not explicitly defined in Pair
        assert address.second().equals(new Tuple<>("123 Main St", "New York", "NY"));
    }

    @Test
    public void usingRecordDirectly_createsImplicitMethods() {
        Address address = new Address("123 Fake St", "San Francisco", "SF");
        // None of the methods below are explicitly defines in Address
        assert address.street().equals("123 Fake St");
        assert address.city().equals("San Francisco");
        assert address.state().equals("SF");
    }

}
