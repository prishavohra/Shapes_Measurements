// Cuboid.java
// Polymorphism implementation for Cuboid (3D shape)

import java.util.*;

class Cuboid extends Shape implements Volume {
    // Constructor accepting length, width, and height
    public Cuboid(double length, double width, double height) {
        super(length, width, height, 6, "Cuboid");
    }
