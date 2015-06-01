package java.de.ko.designPatterns.adapterPattern;

public class WildTurkey implements Turkey{
    public void gobble() {
        System.out.println("gobble gobble");
    }

    public void fly() {
        System.out.println("Flying a short distance!");
    }
}
