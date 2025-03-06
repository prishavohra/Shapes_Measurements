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
    
