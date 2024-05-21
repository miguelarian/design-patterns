package com.miguelvela;

public class UnsupportedOperation extends BaseOperation {
    private OperationChain nextChain;

    @Override
    protected boolean canIHandleOperation(MathOperation operation) {
        return false;
    }

    @Override
    protected void handleOperation(MathOperation operation) {
        System.out.println("Unsupported operation: " + operation.getOperation());
    }
}
