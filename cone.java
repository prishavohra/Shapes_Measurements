// Cone.java
// Polymorphism implementation for Cone

class Cone extends Shape {
    
    // Constructor accepting radius and height
    public Cone(double radius, double height) {
        super(radius, height, 0, 3, "Cone");
    }
    
    // Surface Area of Cone = πr(r + l)
    // where l = √(r² + h²)
    public double calculateArea() {
        double l = Math.sqrt(Math.pow(dim_one, 2) + Math.pow(dim_two, 2));
        return Math.PI * dim_one * (dim_one + l);
    }
    
    // Perimeter not applicable for 3D shape
    public double calculatePerimeter() {
        return 0.0;
    }
    
    // Volume of Cone = (1/3)πr²h
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(dim_one, 2) * dim_two;
    }
}
