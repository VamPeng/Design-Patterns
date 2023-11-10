package vam.design.static_proxy;

public class Pursuit implements IGiveGift {

    public Pursuit(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void giveDolls() {
        System.out.println(name + " 送娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(name + " 送花");
    }
}
