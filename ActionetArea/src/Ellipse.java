/**
 *
 * @author Mark
 * @description Implements Shape interface for a circle
 */
public class Ellipse implements Shape {
    private double axisA;
    private double axisB;
    
    public double getAxisA() {
        return axisA;
    }
    
    public double getAxisB() {
        return axisB;
    }
    
    public Ellipse( double axisA, double axisB) {
        if (axisA < 0.0 || axisB < 0.0) {
            throw new IllegalArgumentException("Arguments must be >= 0");
        }
        if (axisA < axisB ) {
            throw new
            IllegalArgumentException("First axis must be larger than second");
        }
        this.axisA = axisA;
        this.axisB = axisB;
    }
    
    @Override
    public double getArea() {
        return Math.PI * axisA * axisB;
    }
    
    public double getPerimeter() {
        // Go Ramanujan!
        double h = Math.pow((axisA-axisB), 2.0) / Math.pow((axisA+axisB),2.0);
        return Math.PI * (axisA+axisB) *
                ( 1 + ( (3*h)/(10+Math.sqrt(4-(3*h)))));
    }
}
