package vam.design.algorithm.handle;

import java.math.BigDecimal;

public class CashNormal extends AbsCashSuper{
    @Override
    public String acceptCash(double price, int num) {
        BigDecimal bPrice = new BigDecimal(price);
        BigDecimal bNum = new BigDecimal(num);
        return bPrice.multiply(bNum).toPlainString();
    }
}
