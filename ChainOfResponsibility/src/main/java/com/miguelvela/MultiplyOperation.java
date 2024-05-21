package com.miguelvela;

public class MultiplyOperation implements OperationChain {
    public static final String MULTIPLY = "mul";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!operation.getOperation().equals(MULTIPLY)) {
            nextChain.calculate(operation);
            return;
        }

        System.out.println("Multiplication operation");
        System.out.println(
                operation.getOperator1() +
                " * " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() * operation.getOperator2()));
    }
}
