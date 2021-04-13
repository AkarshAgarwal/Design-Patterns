package strategy.pattern.behaviour.quack.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.behaviour.quack.IQuackBehaviour;

public class LightQuacking implements IQuackBehaviour {
    public static final Logger LOGGER = LoggerFactory.getLogger(LightQuacking.class);

    public void quack() {
        LOGGER.info("Normal Quack");
    }
}
