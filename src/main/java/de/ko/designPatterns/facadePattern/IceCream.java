package java.de.ko.designPatterns.facadePattern;

public class IceCream {
    public void getOutOfFridge() {
        System.out.println("Get Ice Cream out of the fridge");
    }

    public void openUp() {
        System.out.println("Open Ice Cream.");
    }

    public void eat() {
        System.out.println("Eat Ice cream.");
    }

    public void throwAway() {
        System.out.println("Throw away into trash.");
    }
}
