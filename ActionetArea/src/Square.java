/**
 *
 * @author Mark
 * @description Implements Shape interface for a circle
 */
public class Square implements Shape {
    private Rectangle rectangle;
    
    public double getSide() {
        return rectangle.getHeight();
    }
       
    public Square( double side) {
        if (side < 0.0) {
            throw new IllegalArgumentException("Argument must be >= 0");
        }
        rectangle = new Rectangle(side, side);
    }
    
    @Override
    public double getArea() {
        return rectangle.getArea();
    }
    
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }
}
