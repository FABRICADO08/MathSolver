package com.mydomain.mathsolver.service;

import org.springframework.stereotype.Service;
import org.symja.exp.Expr;
import org.symja.util.SymjaUtils;

@Service
public class CalculusService {

    public String solveIntegral(String expression) {
        try {
            // The SymjaUtils class provides a simple way to evaluate expressions
            // For more complex, step-by-step logic, you would interact
            // with Symja's deeper features to transform the expression.
            Expr result = SymjaUtils.eval("Integrate(" + expression + ")");
            return result.toString();
        } catch (Exception e) {
            return "Error: Could not solve the integral. " + e.getMessage();
        }
    }
}