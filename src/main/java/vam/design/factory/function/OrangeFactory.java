package vam.design.factory.function;

public class OrangeFactory extends AbsFactory<Orange> {
    @Override
    public Orange createFruit() {
        return new Orange();
    }
}
