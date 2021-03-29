package strategy.pattern.behaviour.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.ibehaviour.IFlyBehaviour;


public class NoFlying implements IFlyBehaviour {


    public static final Logger LOGGER = LoggerFactory.getLogger(NoFlying.class);

    public void fly() {
        LOGGER.info("No Flying :(");
    }
}
