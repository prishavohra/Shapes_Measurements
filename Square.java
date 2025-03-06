// Square.java
// Extends Rectangle to implement Square shape calculations

public class Square extends Rectangle {
    // Constructor accepting the side length; a square is a rectangle with equal sides.
    public Square(double side) {
        super(side, side);
        // Override the shape name to "Square"
        this.shapeName = "Square";
    }
