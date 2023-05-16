package UpdatedFactory;

public sealed interface Shape permits Circle, Rectangle {
    double getArea();
}
