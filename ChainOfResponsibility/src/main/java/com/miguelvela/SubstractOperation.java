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
    public void calculate(MathOperation request) {
        if (!request.getOperation().equals(SUBSTRACT)) {
            nextChain.calculate(request);
            return;
        }

        System.out.println("Subtraction operation");
        System.out.println(
                request.getOperator1() +
                " - " +
                request.getOperator2() +
                " = " +
                (request.getOperator1() - request.getOperator2()));
    }
}
