import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;

        // Prompt user to input wall's height inside a do-while loop
        do {
            try {
                System.out.println("Enter wall height (feet): "); // prompt and get input
                wallHeight = scnr.nextDouble();

                // After input is received, checks if it is positive, outputs message if not
                if (wallHeight <= 0.0) {
                    System.out.println("Height must be greater than 0.");
                }
            }
            // Catches the exception if it is the wrong input type
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // clear invalid input
            }
        } while (wallHeight <= 0.0);

        // Prompt user to input wall's width inside a do-while loop
        do {
            try {
                System.out.println("Enter wall width (feet): "); // prompt and get input
                wallWidth = scnr.nextDouble();

                // After input is received, checks if it is positive, outputs message if not
                if (wallWidth <= 0.0) {
                    System.out.println("Width must be greater than 0.");
                }
            }
            // Catches the exception if it is the wrong input type
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // clear invalid input
            }
        } while (wallWidth <= 0.0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
