# TVET Math Solver

## Overview
The TVET Math Solver is a Java application designed to assist users in solving various mathematical problems, including quadratic equations, basic differentiation, and calculating the area of a circle. This application serves as a learning tool for students at TVET colleges.

## Project Structure
The project is organized as follows:

```
MathSolver
├── src
│   └── main
│       └── java
│           ├── TvetMathSolverApp.java
│           └── solvers
│               ├── CircleAreaSolver.java
│               ├── DifferentiationSolver.java
│               └── QuadraticEquationSolver.java
├── pom.xml
└── README.md
```

## Requirements
- Java Development Kit (JDK) 1.8 or higher
- Apache Maven

## Setup Instructions
1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd MathSolver
   ```

2. **Build the project**:
   Use Maven to compile the project and create a JAR file:
   ```
   mvn clean package
   ```

3. **Run the application**:
   After building, you can run the application using the generated JAR file located in the `target` directory:
   ```
   java -jar target/MathSolver-1.0-SNAPSHOT.jar
   ```

## Features
- **Quadratic Equation Solver**: Solve equations of the form ax² + bx + c = 0.
- **Basic Differentiation**: Perform differentiation using the power rule.
- **Circle Area Calculator**: Calculate the area of a circle given its radius.

## Contribution
Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.