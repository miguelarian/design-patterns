package com.miguelvela;

public class Main {
    public static void main(String[] args) {

        OperationChain chain = new AddOperation();
        OperationChain sub = new SubtractOperation();
        OperationChain mul = new MultiplyOperation();
        OperationChain div = new DivideOperation();
        OperationChain unsupportedOperation = new UnsupportedOperation();

        unsupportedOperation.setNextChain(div);

        chain.setNextChain(sub)
                .setNextChain(mul)
                .setNextChain(div)
                .setNextChain(unsupportedOperation);

        MathOperation addOperation = new MathOperation(4, 2, AddOperation.ADD);
        chain.calculate(addOperation);
        MathOperation subOperation = new MathOperation(4, 2, SubtractOperation.SUBTRACT);
        chain.calculate(subOperation);
        MathOperation mulOperation = new MathOperation(4, 2, MultiplyOperation.MULTIPLY);
        chain.calculate(mulOperation);
        MathOperation divOperation = new MathOperation(4, 2, DivideOperation.DIVIDE);
        chain.calculate(divOperation);
        MathOperation moduleOperation = new MathOperation(4, 2, "MOD"); // not supported
        chain.calculate(moduleOperation);
    }
}