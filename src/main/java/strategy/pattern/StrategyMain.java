package strategy.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strategy.pattern.Duck.Duck;
import strategy.pattern.behaviour.flying.impl.JetFlying;
import strategy.pattern.behaviour.flying.impl.NoFlying;
import strategy.pattern.behaviour.flying.impl.SimpleFlying;
import strategy.pattern.behaviour.quack.impl.LightQuacking;
import strategy.pattern.behaviour.quack.impl.LoudQuacking;
import strategy.pattern.behaviour.quack.impl.NoQuacking;
import strategy.pattern.behaviour.flying.IFlyBehaviour;
import strategy.pattern.behaviour.quack.IQuackBehaviour;

public class StrategyMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(StrategyMain.class);

    private static Duck mountainDuck;
    private static Duck cloudDuck;
    private static Duck pondDuck;
    private static Duck deadDuck;
    private static Duck chaoticDuck;


    public static void main(String[] args) {

        init();

        LOGGER.info("Validating Mountain Duck.");
        flyAndQuack(mountainDuck);
        LOGGER.info("");

        LOGGER.info("Validating Cloud Duck.");
        flyAndQuack(cloudDuck);
        LOGGER.info("");

        LOGGER.info("Validating Pond Duck.");
        flyAndQuack(pondDuck);
        LOGGER.info("");

        LOGGER.info("Validating Chaotic Duck.");
        flyAndQuack(chaoticDuck);
        LOGGER.info("");

        LOGGER.info("Validating Dead Duck.");
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
        chaoticDuck = new Duck(loudQuacking,jeyFlying);
    }

    private static void flyAndQuack(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
