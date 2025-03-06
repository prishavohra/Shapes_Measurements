// Shape.java

abstract class Shape {
    protected double dim_one;
    protected double dim_two;
    protected double dim_three;
    protected int num_sides;
    protected String shapeName;  // New field to store the shape name

    // Zero Parameter Constructor
    public Shape(){
        dim_one = dim_two = dim_three = 0;
        num_sides = 0;
        shapeName = "";
    }
    
