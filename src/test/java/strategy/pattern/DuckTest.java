package strategy.pattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import strategy.pattern.Duck.Duck;
import strategy.pattern.behaviour.impl.*;
import strategy.pattern.ibehaviour.IFlyBehaviour;
import strategy.pattern.ibehaviour.IQuackBehaviour;

public class DuckTest {


    private static IFlyBehaviour noFlying;
    private static IFlyBehaviour simpleFlying;
    private static IFlyBehaviour jeyFlying;

    private static IQuackBehaviour lightQuacking;
    private static IQuackBehaviour loudQuacking;
    private static IQuackBehaviour noQuacking;

    private static Duck mountainDuck;
    private static Duck cloudDuck;
    private static Duck pondDuck;

    @BeforeClass
    public static void initialize() {
        System.out.println("Initializing Behaviours");
        noFlying = new NoFlying();
        simpleFlying = new SimpleFlying();
        jeyFlying = new JetFlying();

        lightQuacking = new LightQuacking();
        loudQuacking = new LoudQuacking();
        noQuacking = new NoQuacking();

        mountainDuck = new Duck(loudQuacking, noFlying);
        cloudDuck = new Duck(noQuacking, jeyFlying);
        pondDuck = new Duck(lightQuacking, simpleFlying);

        System.out.println("Ducks Initialized too...\n");
    }

    


    @Test
    public void mountainDuckTest() {
        System.out.println("Starting Mountain Duck test.");
        mountainDuck.fly();
        mountainDuck.quack();
        System.out.println("Mountain Duck test Finished.\n");
    }

    @Test
    public void cloudDuckTest() {
        System.out.println("Starting Cloud Duck test.");
        cloudDuck.fly();
        cloudDuck.quack();
        System.out.println("Cloud Duck test Finished.\n");
    }

    @Test
    public void pondDuckTest() {
        System.out.println("Starting Pond Duck test.");
        pondDuck.fly();
        pondDuck.quack();
        System.out.println("Pond Duck test Finished.\n");
    }


}
