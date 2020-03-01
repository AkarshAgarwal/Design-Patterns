package strategy.pattern.behaviour.impl;

import strategy.pattern.ibehaviour.IFlyBehaviour;

public class JetFlying implements IFlyBehaviour {
    public void fly() {
        System.out.println("Swoosh");
    }
}
