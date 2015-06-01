package java.de.ko.designPatterns.adapterPattern;

public class DuckTestDrive {

    public static void main (String[] args) {
        Duck duck = new MallardDuck();

        testDuck(duck);

        Turkey turkey = new WildTurkey();
        Duck turkeyDuckyfied = new TurkeyAdapter(turkey);

        testDuck(turkeyDuckyfied);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
