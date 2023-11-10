package vam.design.factory.function;

public class FunctionFactory {

    public static void main(String[] args) {
        AbsFactory<?> appleFactory = new AppleFactory();
        AbsFactory<?> orangeFactory = new OrangeFactory();

        appleFactory.createFruit();
        orangeFactory.createFruit();
    }

}
