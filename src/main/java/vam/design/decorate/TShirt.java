package vam.design.decorate;

public class TShirt extends Finery{

    public void wearShirt(){
        System.out.println("wear TShirt");
    }

    @Override
    public void show() {
        wearShirt();
        person.show();
    }
}
