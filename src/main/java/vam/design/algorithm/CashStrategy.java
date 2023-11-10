package vam.design.algorithm;

import vam.design.algorithm.handle.AbsCashSuper;
import vam.design.algorithm.handle.CashNormal;
import vam.design.algorithm.handle.CashRebate;
import vam.design.algorithm.handle.CashReturn;

public class CashStrategy {

    private AbsCashSuper acs;

    public CashStrategy(int type) {
        switch (type) {
            case 1:
                acs = new CashNormal();
                break;
            case 2:
                acs = new CashReturn(300, 100);
                break;
            case 3:
                acs = new CashRebate(.8);
                break;
            default:
                break;
        }
    }

    public String getResult(double price, int num) {
        return acs.acceptCash(price, num);
    }
}
