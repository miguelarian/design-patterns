package com.miguelvela;

public class SubstractOperation implements OperationChain {
    public static final String SUBSTRACT = "sub";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!operation.getOperation().equals(SUBSTRACT)) {
            nextChain.calculate(operation);
            return;
        }

        System.out.println("Subtraction operation");
        System.out.println(
                operation.getOperator1() +
                " - " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() - operation.getOperator2()));
    }
}
