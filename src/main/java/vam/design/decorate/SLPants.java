package vam.design.decorate;

public class SLPants extends Finery {

    public void lookMirror() {
        System.out.println("照镜子");
    }

    public void wearPants() {
        System.out.println("穿裤子");
    }

    @Override
    public void show() {
        wearPants();
        lookMirror();
        person.show();
    }
}
