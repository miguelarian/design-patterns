package com.miguelvela;

public class DivideOperation extends BaseOperation {
    public static final String DIVIDE = "div";

    @Override
    protected boolean canIHandleOperation(MathOperation operation) {
        return operation.getOperation().equals(DIVIDE);
    }

    @Override
    protected void handleOperation(MathOperation operation) {
        System.out.println("Division operation");
        System.out.println(
                operation.getOperator1() +
                " / " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() / operation.getOperator2()));
    }
}
