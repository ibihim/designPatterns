package java.de.ko.designPatterns.templatePattern;

public class Tea extends CaffeineBeverage {
    void brew() {
        System.out.println("brewing some tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
