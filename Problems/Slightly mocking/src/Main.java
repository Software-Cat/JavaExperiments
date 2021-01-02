/*
 * Copyright © Bowen Wu 2021.
 * All rights reserved.
 */

import java.io.File;

class CalculatorEngine {

    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

}

class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Division of ");
            sb.append(a);
            sb.append(" by ");
            sb.append(b);
            sb.append(" = ");
            sb.append(engine.divide(a, b));
            return sb.toString();
        } catch (ArithmeticException e) {
            return "Division by zero is prohibited";
        }
    }
}