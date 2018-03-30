/**
 *
 * @author Mark
 * @description Implements Shape interface for a circle
 */
public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public Rectangle( double height, double width) {
        if (height < 0.0 || width < 0.0) {
            throw new IllegalArgumentException("Arguments must be >= 0");
        }
        this.height = height;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return height * width;
    }
    
    public double getPerimeter() {
        return height*2 + width * 2;
    }
}
