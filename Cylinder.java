// Cylinder.java
// Extends Shape and implements Volume for 3D cylinder calculations

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;
    
    // Constructor accepting the radius and height of the cylinder
    public Cylinder(double radius, double height) {
        super(radius, height, 0, 0, "Cylinder"); // Number of sides is not applicable; set to 0
        this.radius = radius;
        this.height = height;
    }
