package java.de.ko.designPatterns.adapterPattern;

public class MallardDuck implements Duck {

    public void fly() {
        System.out.println("I am flying!");
    }

    public void quack() {
        System.out.println("Quaack!");
    }
}
