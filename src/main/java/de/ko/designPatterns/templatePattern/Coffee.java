package java.de.ko.designPatterns.templatePattern;

public class Coffee extends CaffeineBeverage{
    void brew() {
        System.out.println("brewing some coffee");
    }

    void addCondiments() {
        System.out.println("Adding some milk");
    }
}
