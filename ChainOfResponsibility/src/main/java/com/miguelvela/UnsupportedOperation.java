package com.miguelvela;

public class UnsupportedOperation implements OperationChain {
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain;
    }

    @Override
    public void calculate(MathOperation operation) {
        System.out.println("Unsupported operation: " + operation.getOperation());
    }
}
