package com.miguelvela;

public class SubtractOperation extends BaseOperation {

    public static final String SUBTRACT = "sub";

    @Override
    protected boolean canIHandleOperation(MathOperation operation) {
        return operation.getOperation().equals(SUBTRACT);
    }

    @Override
    protected void handleOperation(MathOperation operation) {
        System.out.println("Subtraction operation");
        System.out.println(
                operation.getOperator1() +
                " - " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() - operation.getOperator2()));
    }
}
