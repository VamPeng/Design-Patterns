package vam.design.algorithm;

public class Algorithm {

    public static void main(String[] args) {

        CashStrategy cs1 = new CashStrategy(1);

        System.out.println(cs1.getResult(100,10));

        CashStrategy cs2 = new CashStrategy(2);
        System.out.println(cs2.getResult(100,10));

        CashStrategy cs3 = new CashStrategy(3);
        System.out.println(cs3.getResult(100,10));

    }

}
