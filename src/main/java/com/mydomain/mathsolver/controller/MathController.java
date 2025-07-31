package com.mydomain.mathsolver.controller;

import com.yourdomain.mathsolver.service.CalculusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
public class MathController {

    @Autowired
    private CalculusService calculusService;

    @PostMapping("/integrate")
    public String integrate(@RequestBody String expression) {
        // A more robust solution would take a JSON object
        return calculusService.solveIntegral(expression);
    }
}