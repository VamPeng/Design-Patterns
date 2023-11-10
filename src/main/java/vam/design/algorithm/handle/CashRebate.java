package vam.design.algorithm.handle;

import java.math.BigDecimal;

public class CashRebate extends AbsCashSuper {

    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public String acceptCash(double price, int num) {

        double total = price * num;

        double result = total * moneyRebate;

        return String.valueOf(result);
    }
}
