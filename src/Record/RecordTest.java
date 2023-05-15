package Record;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    /* In practice, you would probably use a record directly to store an address
     * instead of using a record to store a record. This is just an example.
     */
    private Pair<String, Tuple<String, String, String>> address;

    @BeforeEach
    public void setUp() {
         address = new Pair<>("Firstname Lastname",
                new Tuple<>("123 Main St", "New York", "NY"));
    }

    @Test
    public void creatingNewPair_returnsObjectWithSize2() {
        // getSize() is a default method implemented in Record.Pair
        assertEquals (address.getSize(), 2);
    }

    @Test
    public void gettingFirstElementOfPair_returnsFirstElement() {
        // first() is not explicitly defined in Record.Pair
        assertEquals(address.first(), ("Firstname Lastname"));
    }

    @Test
    public void gettingSecondElementOfPair_returnsSecondElement() {
        // second() is not explicitly defined in Record.Pair
        assertEquals(address.second(), (new Tuple<>("123 Main St", "New York", "NY")));
    }

    @Test
    public void usingRecordDirectly_createsImplicitMethods() {
        Address address = new Address("123 Fake St", "San Francisco", "SF");

        // None of the methods below are explicitly defined in Record.Address
        assertEquals(address.street(), ("123 Fake St"));
        assertEquals(address.city(), ("San Francisco"));
        assertEquals(address.state(), ("SF"));
    }

}
