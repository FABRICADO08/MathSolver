// src/solvers/QuadraticEquationSolver.java
package solvers;

import Solver;
import UserInput;

public class QuadraticEquationSolver implements Solver {

    @Override
    public void solve() {
        System.out.println("\n--- Quadratic Equation Solver ---");
        System.out.println("Solves equations of the form: ax^2 + bx + c = 0");

        // Get coefficients from user
        double a = UserInput.getDouble("Enter coefficient 'a': ");
        double b = UserInput.getDouble("Enter coefficient 'b': ");
        double c = UserInput.getDouble("Enter coefficient 'c': ");

        System.out.println("\n---------------------------------");
        System.out.println("Problem: Solve " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("---------------------------------\n");

        // Step 1: The Quadratic Formula
        System.out.println("Step 1: Use the Quadratic Formula.");
        System.out.println("   x = [-b ± sqrt(b^2 - 4ac)] / 2a");
        System.out.println();

        // Step 2: Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("Step 2: Calculate the discriminant (Δ = b^2 - 4ac).");
        System.out.printf("   Δ = (%.2f)^2 - 4 * (%.2f) * (%.2f)\n", b, a, c);
        System.out.printf("   Δ = %.2f - %.2f\n", (b * b), (4 * a * c));
        System.out.printf("   Δ = %.2f\n\n", discriminant);

        // Step 3: Analyze the discriminant and find the roots
        System.out.println("Step 3: Find the roots based on the discriminant.");
        if (discriminant > 0) {
            System.out.println("Since the discriminant is positive, there are two distinct real roots.");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("   Root 1 (x1) = [-%.2f + sqrt(%.2f)] / (2 * %.2f) = %.4f\n", b, discriminant, a, root1);
            System.out.printf("   Root 2 (x2) = [-%.2f - sqrt(%.2f)] / (2 * %.2f) = %.4f\n\n", b, discriminant, a, root2);
            System.out.printf("SOLUTION: The roots are x1 = %.4f and x2 = %.4f\n", root1, root2);

        } else if (discriminant == 0) {
            System.out.println("Since the discriminant is zero, there is exactly one real root.");
            double root = -b / (2 * a);
            System.out.printf("   x = -%.2f / (2 * %.2f) = %.4f\n\n", b, a, root);
            System.out.printf("SOLUTION: The single root is x = %.4f\n", root);

        } else {
            System.out.println("Since the discriminant is negative, there are two complex roots.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("   Roots are in the form x = real ± imaginary*i");
            System.out.printf("   Real Part = -%.2f / (2 * %.2f) = %.4f\n", b, a, realPart);
            System.out.printf("   Imaginary Part = sqrt(%.2f) / (2 * %.2f) = %.4fi\n", -discriminant, a, imaginaryPart);
            System.out.printf("\nSOLUTION: The roots are x1 = %.4f + %.4fi and x2 = %.4f - %.4fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
        System.out.println("---------------------------------");
    }
}
