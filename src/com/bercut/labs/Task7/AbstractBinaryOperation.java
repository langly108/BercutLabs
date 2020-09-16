package com.bercut.labs.Task7;

public abstract class AbstractBinaryOperation implements Operation {

    private double operandA;
    private double operandB;

    public double getOperandA() {
        return operandA;
    }

    public double getOperandB() {
        return operandB;
    }

    protected double abstractBinaryOperation(double a, double b) {
        return 0;

    }

}
