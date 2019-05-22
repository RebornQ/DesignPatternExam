package _4_IntergratedExam.interfaces.impl;


import _4_IntergratedExam.interfaces.AbstractTaxRateStrategy;

public class ConcreteTaxExemptionStrategy extends AbstractTaxRateStrategy {

    // 减免税款（5000=<税款<10000,则税费减少300）
    /**
     *
     * @param money 税费
     * @return 奖励方案后的税费
     */
    @Override
    public double algorithm(double money) {
        return money - 300;
    }
}
