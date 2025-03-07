# Shapes_Measurements

This repository contains a Java application that calculates the area, perimeter, and volume for various geometric shapes. It demonstrates key object-oriented programming concepts such as abstraction, inheritance, polymorphism, and interfaces. The project is structured with multiple Java files, each representing a specific class or interface, and the program is menu-driven for ease of use.

## Project Structure

- **Shape.java**  
  *Abstract class that defines common attributes and methods for all shapes.*  
  **Key Points:**  
  - **Fields:** `dim_one`, `dim_two`, `dim_three` (dimensions), `num_sides` (number of sides), and `shapeName`.
  - **Constructors:**  
    - A zero-parameter constructor that initializes dimensions and sides to 0.
    - Parameterized constructors that set dimensions, number of sides, and the shape name.
  - **Abstract Methods:**  
    - `calculateArea()`: Calculates the area (or surface area for 3D shapes).
    - `calculatePerimeter()`: Calculates the perimeter (or base perimeter where applicable).
    - `calculateVolume()`: Calculates the volume (returns 0 for 2D shapes).

- **Volume.java**  
  *Interface that declares the method to calculate volume for 3D shapes.*  
  - **Method:**  
    - `double calculateVolume()`

- **Circle.java**  
  *Class for 2D circles extending `Shape`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns π * r².
  - `calculatePerimeter()`: Returns 2π * r.
  - `calculateVolume()`: Returns 0.

- **Rectangle.java**  
  *Class for 2D rectangles extending `Shape`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns length * width.
  - `calculatePerimeter()`: Returns 2 * (length + width).
  - `calculateVolume()`: Returns 0.

- **Square.java**  
  *Class for squares, a special type of rectangle with equal sides.*  
  **Key Methods:**  
  - Inherits area and perimeter calculations from `Rectangle`.
  - Overrides `calculateVolume()` to return 0.

- **Cuboid.java**  
  *Class for 3D cuboids extending `Shape` and implementing `Volume`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns the total surface area.
  - `calculatePerimeter()`: Returns the sum of all edge lengths.
  - `calculateVolume()`: Returns length * width * height.

- **Sphere.java**  
  *Class for 3D spheres extending `Shape` and implementing `Volume`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns surface area (4π * r²).
  - `calculatePerimeter()`: Returns 0 (not applicable).
  - `calculateVolume()`: Returns volume ((4/3)π * r³).

- **Cylinder.java**  
  *Class for 3D cylinders extending `Shape` and implementing `Volume`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns total surface area (including top and bottom).
  - `calculatePerimeter()`: Returns 0 (not applicable).
  - `calculateVolume()`: Returns volume (π * r² * h).

- **EquilateralPyramid.java**  
  *Class for 3D equilateral pyramids (square base) extending `Shape` and implementing `Volume`.*  
  **Key Methods:**  
  - `calculateArea()`: Returns total surface area (base area + lateral area).
  - `calculatePerimeter()`: Returns the perimeter of the base.
  - `calculateVolume()`: Returns volume ((base² * height) / 3).

- **Main.java**  
  *The entry point of the application. Provides a menu-driven interface for user interaction.*  
  **Key Functions:**  
  - `processRectangle()`: Handles rectangle input and calculations.
  - `processCircle()`: Handles circle input and calculations.
  - `processCuboid()`: Handles cuboid input and calculations.
  - `processSquare()`: Handles square input and calculations.
  - `processSphere()`: Handles sphere input and calculations.
  - `processCylinder()`: Handles cylinder input and calculations.
  - `processEquilateralPyramid()`: Handles equilateral pyramid input and calculations.

## How to Run

1. **Clone the repository:**
   ```bash
   git clone <repository_url>
