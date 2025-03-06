// Rectangle.java
// Polymorphism implementation for Rectangle

class Rectangle extends Shape {
    // Constructor accepting length and width
    public Rectangle(double length, double width) {
        super(length, width, 0, 4, "Rectangle");
    }
    
    public double calculateArea(){
        return dim_one * dim_two;
    }
    
    // Calculate the perimeter of the rectangle
    public double calculatePerimeter(){
        return 2 * (dim_one + dim_two);
    }
    
    // Rectangle is 2D so volume is 0
    public double calculateVolume() {
        return 0.0;
    }
}

