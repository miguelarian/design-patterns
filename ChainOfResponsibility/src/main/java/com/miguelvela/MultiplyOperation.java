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
    public void calculate(MathOperation request) {
        if (!request.getOperation().equals(MULTIPLY)) {
            nextChain.calculate(request);
            return;
        }

        System.out.println("Multiplication operation");
        System.out.println(
                request.getOperator1() +
                " * " +
                request.getOperator2() +
                " = " +
                (request.getOperator1() * request.getOperator2()));
    }
}
