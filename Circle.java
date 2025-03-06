// Circle.java
// Polymorphism implementation for Circle

class Circle extends Shape {
    // Constructor accepting the radius
    public Circle(double radius) {
        super(radius, 0, 0, 1, "Circle");
    }
    
    public double calculateArea(){
        return Math.PI * Math.pow(dim_one, 2);
    }
    
    public double calculatePerimeter(){
        return 2 * Math.PI * dim_one;
    }
    
    public double calculateVolume() {
        return 0.0;
    }
}
