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
    
    // Parameterized Constructor with shape name
    public Shape(double dim_one, double dim_two, double dim_three, int num_sides, String shapeName){
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_sides = num_sides;
        this.shapeName = shapeName;
    }
    
    // Existing constructor for backwards compatibility (sets empty shapeName)
    public Shape(double dim_one, double dim_two, double dim_three, int num_sides){
        this(dim_one, dim_two, dim_three, num_sides, "");
    }
    
    // Abstract method to calculate area (or surface area for 3D shapes)
    abstract public double calculateArea();
    
    // Abstract method to calculate perimeter (or base perimeter for some 3D shapes)
    abstract public double calculatePerimeter();
    
    // Abstract method to calculate volume (for 3D shapes; for 2D shapes, return 0)
    abstract public double calculateVolume();
    
    // Getter for the number of sides
    public int getNumSides(){
        return num_sides;
    }
    
    // Getter for the shape name
    public String getShapeName(){
        return shapeName;
    }
}

