package _4_IntergratedExam.adapter;


import _4_IntergratedExam.bean.Product;
import _4_IntergratedExam.interfaces.TaxRateCalculator;
import _4_IntergratedExam.interfaces.TaxRateInterface;

public class TaxRateAdapter implements TaxRateInterface {

    private TaxRateCalculator taxRateCalculator;

    public TaxRateAdapter(TaxRateCalculator taxRateCalculator) {
        this.taxRateCalculator = taxRateCalculator;
    }


    @Override
    public double findTaxRate(String code) {
        return taxRateCalculator.checkTaxRate(code);
    }

    public Product findProductByCode(String code) {
        for (Product product : taxRateCalculator.getProducts()) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        return null;
    }
}
