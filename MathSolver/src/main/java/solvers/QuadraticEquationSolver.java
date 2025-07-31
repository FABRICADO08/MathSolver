public class QuadraticEquationSolver implements Solver {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter coefficients for the equation ax^2 + bx + c = 0");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and different: %.2f and %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Roots are real and the same: %.2f%n", root);
        } else {
            System.out.println("Roots are complex and different.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are: %.2f + %.2fi and %.2f - %.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}