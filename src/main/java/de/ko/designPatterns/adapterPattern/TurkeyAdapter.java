package java.de.ko.designPatterns.adapterPattern;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        // flying an equally long distance
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
