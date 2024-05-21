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
    public void calculate(MathOperation request) {
        if (!request.getOperation().equals(DIVIDE)) {
            nextChain.calculate(request);
            return;
        }

        System.out.println("Division operation");
        System.out.println(
                request.getOperator1() +
                " / " +
                request.getOperator2() +
                " = " +
                (request.getOperator1() / request.getOperator2()));
    }
}
