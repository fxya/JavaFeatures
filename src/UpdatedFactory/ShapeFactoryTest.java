package UpdatedFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void creatingCircle_returnsCircleObject() {
        Shape circle = ShapeFactory.createShape("circle");
        assertTrue(circle instanceof Circle);
    }
    @Test
    void creatingRectangle_returnsRectangleObject() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle);
    }
    @Test
    void creatingSquare_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> ShapeFactory.createShape("square"));
    }

}