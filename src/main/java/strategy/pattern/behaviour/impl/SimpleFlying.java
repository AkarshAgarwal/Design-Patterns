package strategy.pattern.behaviour.impl;

import strategy.pattern.ibehaviour.IFlyBehaviour;

public class SimpleFlying implements IFlyBehaviour {
    public void fly() {
        System.out.println("flap flap flap");
    }
}
