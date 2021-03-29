package strategy.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.Duck.Duck;
import strategy.pattern.behaviour.impl.*;
import strategy.pattern.ibehaviour.IFlyBehaviour;
import strategy.pattern.ibehaviour.IQuackBehaviour;

public class StrategyMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(StrategyMain.class);

    private static Duck mountainDuck;
    private static Duck cloudDuck;
    private static Duck pondDuck;
    private static Duck deadDuck;

    public static void main(String[] args) {

        init();

        LOGGER.info("Starting Mountain Duck.");
        flyAndQuack(mountainDuck);
        LOGGER.info("");

        LOGGER.info("Starting Cloud Duck.");
        flyAndQuack(cloudDuck);
        LOGGER.info("");

        LOGGER.info("Starting Pond Duck.");
        flyAndQuack(pondDuck);
        LOGGER.info("");

        LOGGER.info("Starting Dead Duck.");
        flyAndQuack(deadDuck);
        LOGGER.info("");
    }


    private static void init() {

        IFlyBehaviour noFlying = new NoFlying();
        IFlyBehaviour simpleFlying = new SimpleFlying();
        IFlyBehaviour jeyFlying = new JetFlying();

        IQuackBehaviour lightQuacking = new LightQuacking();
        IQuackBehaviour loudQuacking = new LoudQuacking();
        IQuackBehaviour noQuacking = new NoQuacking();

        mountainDuck = new Duck(loudQuacking, noFlying);
        cloudDuck = new Duck(noQuacking, jeyFlying);
        pondDuck = new Duck(lightQuacking, simpleFlying);
        deadDuck = new Duck(noQuacking, noFlying);
    }

    private static void flyAndQuack(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
