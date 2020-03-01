package strategy.pattern.behaviour.impl;

import strategy.pattern.ibehaviour.IQuackBehaviour;

public class LoudQuacking implements IQuackBehaviour {

    public void quack() {
        System.out.println("QUACK QUACK QUACK");
    }
}
