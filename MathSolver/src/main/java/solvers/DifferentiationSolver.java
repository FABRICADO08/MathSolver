public class DifferentiationSolver implements Solver {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the function to differentiate (e.g., 3x^2 + 2x + 1): ");
        String function = scanner.nextLine();
        
        // Basic differentiation logic using the power rule
        String differentiatedFunction = differentiateFunction(function);
        
        System.out.println("The derivative of the function is: " + differentiatedFunction);
    }

    private String differentiateFunction(String function) {
        // This is a simple implementation and may need enhancements for complex functions
        String[] terms = function.split(" \\+ ");
        StringBuilder derivative = new StringBuilder();

        for (String term : terms) {
            term = term.trim();
            if (term.contains("x")) {
                String[] parts = term.split("x\\^");
                int coefficient = parts.length > 0 ? Integer.parseInt(parts[0].trim()) : 1;
                int exponent = parts.length > 1 ? Integer.parseInt(parts[1].trim()) : 1;

                // Apply the power rule: d/dx [ax^n] = nax^(n-1)
                int newCoefficient = coefficient * exponent;
                int newExponent = exponent - 1;

                if (newExponent == 0) {
                    derivative.append(newCoefficient);
                } else if (newExponent == 1) {
                    derivative.append(newCoefficient).append("x");
                } else {
                    derivative.append(newCoefficient).append("x^").append(newExponent);
                }
                derivative.append(" + ");
            }
        }

        // Remove the last " + " if present
        if (derivative.length() > 0) {
            derivative.setLength(derivative.length() - 3);
        }

        return derivative.toString();
    }
}