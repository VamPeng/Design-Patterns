package vam.design.static_proxy;

public class Proxy implements IGiveGift {

    IGiveGift realSub;

    public Proxy(IGiveGift realSub) {
        this.realSub = realSub;
    }

    @Override
    public void giveDolls() {
        if (realSub != null) {
            realSub.giveDolls();
        }
    }

    @Override
    public void giveFlowers() {
        if (realSub != null) {
            realSub.giveFlowers();
        }
    }
}
