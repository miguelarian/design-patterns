package com.miguelvela;

public class Duck {

    private QuackBehaviour quackBehaviour;

    public Duck(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void mutateQuack(QuackBehaviour newQuackBehaviour) {
        this.quackBehaviour = newQuackBehaviour;
    }

    public void quack() {
        this.quackBehaviour.quack();
    }
}
