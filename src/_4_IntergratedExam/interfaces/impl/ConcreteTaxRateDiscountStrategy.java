package _4_IntergratedExam.interfaces.impl;


import _4_IntergratedExam.interfaces.AbstractTaxRateStrategy;

public class ConcreteTaxRateDiscountStrategy extends AbstractTaxRateStrategy {

    // 降低税率（税款>=10000,则税费打95折）
    /**
     *
     * @param money 税费
     * @return 奖励方案后的税费
     */
    @Override
    public double algorithm(double money) {
        return money * 0.95;
    }
}
