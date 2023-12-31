package vam.design.decorate;

/**
 * 哈，学习模式要善于变通
 * 如果只有一个ConcreteComponent类而没有抽象的Component类，那么Decorator类可以是ConcreteComponent的一个子类。
 * 同样道理，如果只有一个ConcreteDecorator类，那么就没有必要建立一个单独的Decorator类，而可以把Decorator和ConcreteDecorator的责任合并成一个类。
 */
public class Decorator {

    public static void main(String[] args) {

        Person p = new Person("vam");

        Finery shirt = new TShirt();
        Finery pants = new SLPants();

        shirt.decorate(p);
        pants.decorate(shirt);

        pants.show();

    }

}
