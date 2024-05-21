package com.miguelvela;

public class SubtractOperation implements OperationChain {
    public static final String SUBTRACT = "sub";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!operation.getOperation().equals(SUBTRACT)) {
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
