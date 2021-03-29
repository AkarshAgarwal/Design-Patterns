package strategy.pattern.behaviour.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.ibehaviour.IQuackBehaviour;

public class LoudQuacking implements IQuackBehaviour {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoudQuacking.class);

    public void quack() {
        LOGGER.info("Stop Quacking so loudly!!!");
    }
}
