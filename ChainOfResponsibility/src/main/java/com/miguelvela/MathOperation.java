package com.miguelvela;

public class MathOperation {
    private int operator1;
    private int operator2;
    private String operation;

    public MathOperation(int number1, int number2, String operation) {
        this.operator1 = number1;
        this.operator2 = number2;
        this.operation = operation;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public String getOperation() {
        return operation;
    }
}
