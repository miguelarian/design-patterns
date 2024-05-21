package com.miguelvela;

public class UnsupportedOperation implements OperationChain {
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation request) {
        System.out.println("Unsupported operation: " + request.getOperation());
    }
}
