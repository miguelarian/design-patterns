package com.miguelvela;

public class MathOperation {
    private double operator1;
    private double operator2;
    private String operation;

    public MathOperation(double number1, double number2, String operation) {
        this.operator1 = number1;
        this.operator2 = number2;
        this.operation = operation;
    }

    public double getOperator1() {
        return operator1;
    }

    public double getOperator2() {
        return operator2;
    }

    public String getOperation() {
        return operation;
    }
}
