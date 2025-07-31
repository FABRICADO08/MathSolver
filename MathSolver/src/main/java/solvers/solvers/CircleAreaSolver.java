// src/solvers/CircleAreaSolver.java
package solvers;

import Solver;
import UserInput;

public class CircleAreaSolver implements Solver {
    @Override
    public void solve() {
        System.out.println("\n--- Area of a Circle Solver ---");

        double radius = UserInput.getDouble("Enter the radius of the circle: ");

        System.out.println("\n---------------------------------");
        System.out.printf("Problem: Find the area of a circle with radius %.2f\n", radius);
        System.out.println("---------------------------------\n");

        System.out.println("Step 1: Use the formula for the area of a circle.");
        System.out.println("   Area = π * r^2");
        System.out.println();

        double area = Math.PI * radius * radius;

        System.out.println("Step 2: Substitute the radius into the formula.");
        System.out.printf("   Area = π * (%.2f)^2\n", radius);
        System.out.printf("   Area = π * %.2f\n", radius * radius);
        System.out.printf("   Area ≈ %.4f\n\n", area);

        System.out.printf("SOLUTION: The area of the circle is approximately %.4f\n", area);
        System.out.println("---------------------------------");
    }
}
