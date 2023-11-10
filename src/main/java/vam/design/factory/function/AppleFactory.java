package vam.design.factory.function;

public class AppleFactory extends AbsFactory<Apple> {

    @Override
    public Apple createFruit() {
        return new Apple();
    }
}
