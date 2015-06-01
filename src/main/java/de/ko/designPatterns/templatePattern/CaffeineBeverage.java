package java.de.ko.designPatterns.templatePattern;

public abstract class CaffeineBeverage {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        if(hasSugar()) { // a hook
            addSugar();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    boolean hasSugar() {
        return true;
    }

    void boilWater() {
        System.out.println("boiling water");
    }

    void pourInCup() {
        System.out.println("pouring into a cup");
    }

    void addSugar() {
        System.out.println("adding sugar");
    }
}
