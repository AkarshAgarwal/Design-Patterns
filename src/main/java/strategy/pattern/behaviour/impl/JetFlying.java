package strategy.pattern.behaviour.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.ibehaviour.IFlyBehaviour;

public class JetFlying implements IFlyBehaviour {


    public static final Logger LOGGER = LoggerFactory.getLogger(JetFlying.class);

    public void fly() {
        LOGGER.info("Flies so fast");
    }
}
