package vam.design.decorate;

public class Person {

    private String name;

    public Person() {
        name = "无名";
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " 装饰完毕");
    }
}
