/**
 *
 * @author Mark
 * @description Implements Shape interface for a circle
 */
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public double getSideA() {
        return sideA;
    }
    
    public double getSideB() {
        return sideB;
    }
    
    public double getSideC() {
        return sideC;
    }
    
    public Triangle( double sideA, double sideB, double sideC) {
        if (sideA < 0.0 || sideB < 0.0 || sideC < 0.0) {
            throw new IllegalArgumentException("Arguments must be >= 0");
        }
        
        //TODO check if these sides COULD define a triangle
        
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    @Override
    public double getArea() {
        // Heron's formula, using perimeter/2
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));
    }
    
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
