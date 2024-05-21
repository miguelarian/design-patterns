package com.miguelvela;

public class DivideOperation implements OperationChain {
    public static final String DIVIDE = "div";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!operation.getOperation().equals(DIVIDE)) {
            nextChain.calculate(operation);
            return;
        }

        System.out.println("Division operation");
        System.out.println(
                operation.getOperator1() +
                " / " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() / operation.getOperator2()));
    }
}
