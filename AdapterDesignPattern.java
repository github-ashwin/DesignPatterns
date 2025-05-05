// Step 1: Target interface that client expects
interface Shape {
    void draw();
}

// Step 2: Adaptee class (Incompatible class we want to use)
class LegacyRectangle {
    public void drawRectangle() {
        System.out.println("Drawing a rectangle using LegacyRectangle");
    }
}

// Step 3: Adapter class - makes LegacyRectangle compatible with Shape
class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw() {
        // Translate Shape.draw() to LegacyRectangle.drawRectangle()
        legacyRectangle.drawRectangle();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape shape = new RectangleAdapter(legacyRectangle); // Use adapter

        shape.draw(); // Output: Drawing a rectangle using LegacyRectangle
    }
}
