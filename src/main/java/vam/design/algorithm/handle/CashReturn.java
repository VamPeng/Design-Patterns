package vam.design.algorithm.handle;

import java.math.BigDecimal;

public class CashReturn extends AbsCashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public String acceptCash(double price, int num) {

        double total = price * num;

        double result = 0;
        if (total > moneyCondition) {
            result = total - (Math.floor(total / moneyCondition) * moneyReturn);
        }


        return String.valueOf(result);
    }
}
