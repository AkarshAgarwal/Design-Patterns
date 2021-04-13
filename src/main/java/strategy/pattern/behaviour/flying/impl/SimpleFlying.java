package strategy.pattern.behaviour.flying.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.behaviour.flying.IFlyBehaviour;

public class SimpleFlying implements IFlyBehaviour {
    public static final Logger LOGGER = LoggerFactory.getLogger(SimpleFlying.class);

    public void fly() {
        LOGGER.info("Simple Flying");
    }
}
