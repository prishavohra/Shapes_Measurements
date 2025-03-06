// Main.java
// Menu-driven program to calculate area, perimeter, and volume of selected shapes.

import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n------ Shape Calculator Menu ------");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Cuboid");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Cylinder");
            System.out.println("7. Equilateral Pyramid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            
            switch(choice) {
                case 1:
                    processRectangle(scan);
                    break;
                case 2:
                    processCircle(scan);
                    break;
                case 3:
                    processCuboid(scan);
                    break;
                case 4:
                    processSquare(scan);
                    break;
                case 5:
                    processSphere(scan);
                    break;
                case 6:
                    processCylinder(scan);
                    break;
                case 7:
                    processEquilateralPyramid(scan);
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 8);
        
        scan.close();
    }
    
    // Process Rectangle calculations
    public static void processRectangle(Scanner scan) {
        System.out.print("Enter length of Rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = scan.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
        System.out.println("Number of sides: " + rect.getNumSides());
    }
    
    // Process Circle calculations
    public static void processCircle(Scanner scan) {
        System.out.print("Enter radius of Circle: ");
        double radius = scan.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter (Circumference) of Circle: " + circle.calculatePerimeter());
    }
