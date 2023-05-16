package UpdatedFactory;

/* Example of factory pattern using sealed classes/interfaces and pattern matching for switch expressions */

class ShapeFactory {

    // Static factory method
    public static Shape createShape(String type) {
        return switch (type) {
            case "circle" -> new Circle(5.0);
            case "rectangle" -> new Rectangle(4.0, 3.0);
            default -> throw new IllegalArgumentException("Invalid shape type: " + type);
        };
    }
}
