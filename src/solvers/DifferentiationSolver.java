// src/solvers/DifferentiationSolver.java
package solvers;

import Solver;
import UserInput;

public class DifferentiationSolver implements Solver {
    @Override
    public void solve() {
        System.out.println("\n--- Basic Differentiation Solver (Power Rule) ---");
        System.out.println("Finds the derivative of a term in the form: f(x) = ax^n");

        double a = UserInput.getDouble("Enter the coefficient 'a': ");
        double n = UserInput.getDouble("Enter the exponent 'n': ");

        System.out.println("\n---------------------------------");
        System.out.printf("Problem: Find the derivative of f(x) = %.2fx^%.2f\n", a, n);
        System.out.println("---------------------------------\n");

        System.out.println("Step 1: Use the Power Rule for differentiation.");
        System.out.println("   d/dx (ax^n) = (a * n) * x^(n - 1)");
        System.out.println();

        // Calculate new coefficient and exponent
        double newCoeff = a * n;
        double newExp = n - 1;

        System.out.println("Step 2: Apply the rule to your term.");
        System.out.printf("   New Coefficient = a * n = %.2f * %.2f = %.2f\n", a, n, newCoeff);
        System.out.printf("   New Exponent = n - 1 = %.2f - 1 = %.2f\n", n, newExp);
        System.out.println();

        System.out.println("Step 3: Combine the results.");
        System.out.printf("SOLUTION: The derivative f'(x) = %.2fx^%.2f\n", newCoeff, newExp);
        System.out.println("---------------------------------");
    }
}
