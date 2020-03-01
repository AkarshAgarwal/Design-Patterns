package strategy.pattern.Duck;

import strategy.pattern.ibehaviour.IFlyBehaviour;
import strategy.pattern.ibehaviour.IQuackBehaviour;

/*
*
* https://www.youtube.com/watch?v=v9ejT8FO-7I
*
* */
public class Duck {

    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    /*
    * Behaviour is injected in the class instead of inheriting everything
    * */
    public Duck(IQuackBehaviour quackBehaviour, IFlyBehaviour flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void fly(){
        this.flyBehaviour.fly();
    }

    public void quack(){
        this.quackBehaviour.quack();
    }
}
