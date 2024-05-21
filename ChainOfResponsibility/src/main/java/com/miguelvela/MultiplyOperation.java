package com.miguelvela;

public class MultiplyOperation extends BaseOperation {
    public static final String MULTIPLY = "mul";

    @Override
    protected boolean canIHandleOperation(MathOperation operation) {
        return operation.getOperation().equals(MULTIPLY);
    }

    @Override
    protected void handleOperation(MathOperation operation) {
        System.out.println("Multiplication operation");
        System.out.println(
                operation.getOperator1() +
                " * " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() * operation.getOperator2()));
    }
}
