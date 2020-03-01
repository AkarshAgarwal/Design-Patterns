package strategy.pattern.behaviour.impl;

import strategy.pattern.ibehaviour.IQuackBehaviour;

public class LightQuacking implements IQuackBehaviour {
    public void quack() {
        System.out.println("quack");
    }
}
