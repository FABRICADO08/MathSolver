// src/TvetMathSolverApp.java
import solvers.CircleAreaSolver;
import solvers.DifferentiationSolver;
import solvers.QuadraticEquationSolver;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TvetMathSolverApp {

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println(" Welcome to the TVET College Math Solver! ");
        System.out.println("=============================================");

        while (true) {
            printMenu();
            int choice = getUserChoice(menuScanner);
            Solver solver = null;

            switch (choice) {
                case 1:
                    solver = new QuadraticEquationSolver();
                    break;
                case 2:
                    solver = new DifferentiationSolver();
                    break;
                case 3:
                    solver = new CircleAreaSolver();
                    break;
                case 0:
                    System.out.println("\nThank you for using the TVET Math Solver. Goodbye!");
                    UserInput.closeScanner(); // Important to close the shared scanner
                    menuScanner.close();
                    return; // Exit the application
                default:
                    System.out.println("\nError: Invalid choice. Please select an option from the menu.");
                    break;
            }

            if (solver != null) {
                try {
                    solver.solve();
                } catch (Exception e) {
                    System.err.println("\nAn unexpected error occurred during calculation: " + e.getMessage());
                }
            }
            
            System.out.println("\nPress Enter to continue to the main menu...");
            menuScanner.nextLine(); // Consume the newline left-over
            menuScanner.nextLine(); // Wait for user to press Enter
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("Please choose a topic to calculate:");
        System.out.println("1. Quadratic Equation (ax^2 + bx + c = 0)");
        System.out.println("2. Basic Differentiation (Power Rule)");
        System.out.println("3. Area of a Circle");
        System.out.println("--------------------");
        System.out.println("0. Exit");
    }

    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        int choice = -1;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            // If user types text, we set choice to -1 (invalid) and clear the scanner
            scanner.next(); // Clear the bad input
        }
        return choice;
    }
}
