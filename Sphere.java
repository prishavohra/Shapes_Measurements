// Sphere.java
// Extends Shape and implements Volume for 3D sphere calculations

public class Sphere extends Shape implements Volume {
    private double radius;
    
    // Constructor accepting the radius
    public Sphere(double radius) {
        super(radius, 0, 0, 0, "Sphere"); // For sphere, number of sides is not applicable (set to 0)
        this.radius = radius;
    }

    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    public double calculatePerimeter() {
        return 0;
    }
    
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
