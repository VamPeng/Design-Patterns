package vam.design.static_proxy;

/**
 * 代理模式：静态
 */
public class StaticProxy {

    public static void main(String[] args) {

        IGiveGift realSub = new Pursuit("vam");
        IGiveGift giver = new Proxy(realSub);

        giver.giveDolls();
        giver.giveFlowers();

    }

}
