package chapter_one.animals;

import chapter_one.behaviors.FlyBehavior;
import chapter_one.behaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        mFlyBehavior = flyBehavior;
        mQuackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.mQuackBehavior = quackBehavior;
    }
}
