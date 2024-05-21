package com.miguelvela;

public abstract class BaseOperation implements OperationChain {

    private OperationChain nextChain;

    protected abstract boolean canIHandleOperation(MathOperation operation);
    protected abstract void handleOperation(MathOperation operation);

    @Override
    public final OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain ;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!canIHandleOperation(operation)) {
            this.nextChain.calculate(operation);
            return;
        }

        this.handleOperation(operation);
    }
}
