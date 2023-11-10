package vam.design.decorate;

public class Finery extends Person {

    Person person;

    public void decorate(Person component) {
        this.person = component;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
