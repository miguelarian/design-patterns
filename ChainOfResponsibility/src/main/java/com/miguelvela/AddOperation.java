package com.miguelvela;

public final class AddOperation extends BaseOperation {

    public static final String ADD = "add";

    @Override
    protected boolean canIHandleOperation(MathOperation operation) {
        return operation.getOperation().equals(ADD);
    }

    @Override
    protected void handleOperation(MathOperation operation) {
        System.out.println("Addition operation");
        System.out.println(
                operation.getOperator1() +
                " + " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() + operation.getOperator2()));
    }
}
