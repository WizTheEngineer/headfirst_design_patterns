package chapter_one.animals;

import chapter_one.behaviors.FlyWithWings;
import chapter_one.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
