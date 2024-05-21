package com.miguelvela;

public class AddOperation implements OperationChain {

    public static final String ADD = "add";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation request) {
        if (!request.getOperation().equals(ADD)) {
            nextChain.calculate(request);
            return;
        }

        System.out.println("Addition operation");
        System.out.println(
                request.getOperator1() +
                " + " +
                request.getOperator2() +
                " = " +
                (request.getOperator1() + request.getOperator2()));
    }
}
