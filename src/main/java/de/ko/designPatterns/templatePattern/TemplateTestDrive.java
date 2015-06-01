package java.de.ko.designPatterns.templatePattern;

public class TemplateTestDrive {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
