package com.miguelvela;

public interface OperationChain {
    OperationChain setNextChain(OperationChain nextChain);
    void calculate(MathOperation operation);
}
