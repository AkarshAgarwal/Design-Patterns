package strategy.pattern.behaviour.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.ibehaviour.IQuackBehaviour;

public class NoQuacking implements IQuackBehaviour {

    public static final Logger LOGGER = LoggerFactory.getLogger(NoQuacking.class);

    public void quack() {
        LOGGER.info("No Quaking :(");
    }
}
