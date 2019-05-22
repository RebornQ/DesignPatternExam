package _4_IntergratedExam;


import _4_IntergratedExam.adapter.TaxRateAdapter;
import _4_IntergratedExam.bean.Product;
import _4_IntergratedExam.interfaces.AbstractTaxRateStrategy;
import _4_IntergratedExam.interfaces.TaxRateCalculator;
import _4_IntergratedExam.interfaces.impl.ConcreteTaxExemptionStrategy;
import _4_IntergratedExam.interfaces.impl.ConcreteTaxRateDiscountStrategy;

public class Client {

    private static TaxRateAdapter taxRateAdapter = new TaxRateAdapter(new TaxRateCalculator());

    public static void main(String[] args) {
        calTaxResult("pd1", 100);
        System.out.println();
        calTaxResult("pd2", 100);
        System.out.println();
        calTaxResult("pd3", 100);
        System.out.println();
        calTaxResult("pd4", 100);
    }

    // 税费=税率*商品数量*商品单价
    private static double calPdTax(String code, double money, int count) {
        double taxRate = taxRateAdapter.findTaxRate(code);
        if (taxRate == -1) {
            System.out.println("找不到该产品！");
            return -1;
        }
        return taxRate * money * count;
    }

    private static void calTaxResult(String code, int count) {
        Product product = taxRateAdapter.findProductByCode(code);
        if (product == null) {
            System.out.println(code + "\n找不到该产品！");
            return;
        }
        double taxBase = calPdTax(code, product.getMoney(), count); // 奖励前的税费
        double taxResult = taxBase; // 奖励后的税费
        AbstractTaxRateStrategy taxRateStrategy;
        if (taxBase >= 5000 && taxBase < 10000) {
            taxRateStrategy = new ConcreteTaxExemptionStrategy();
            taxResult = taxRateStrategy.algorithm(taxBase);
        }
        if (taxBase >= 10000) {
            taxRateStrategy = new ConcreteTaxRateDiscountStrategy();
            taxResult = taxRateStrategy.algorithm(taxBase);
        }

        System.out.println(code + "\n奖励前的税费为：" + taxBase);
        System.out.println("奖励后的税费为：" + taxResult);
    }
}
