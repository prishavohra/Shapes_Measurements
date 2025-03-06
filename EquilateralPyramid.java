// EquilateralPyramid.java
// Extends Shape and implements Volume for 3D equilateral pyramid (square base) calculations

public class EquilateralPyramid extends Shape implements Volume {
    private double base;
    private double height;
    
    // Constructor accepting the base side length and height of the pyramid
    public EquilateralPyramid(double base, double height) {
        super(base, height, 0, 0, "Equilateral Pyramid"); // For pyramid, number of sides is not directly used
        this.base = base;
        this.height = height;
    }
