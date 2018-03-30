/**
 *
 * @author Mark
 * @description Implements Shape interface for a circle
 */
public class Circle implements Shape {
    private double radius;
    
    public double getRadius() {
        return radius;
    }
    
    public Circle( double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius must be >= 0");
        }
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }
    
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
