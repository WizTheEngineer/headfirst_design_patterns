package chapter_one;

import chapter_one.animals.Duck;
import chapter_one.animals.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
    }
}
