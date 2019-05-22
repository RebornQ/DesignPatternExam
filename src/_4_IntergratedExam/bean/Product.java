package _4_IntergratedExam.bean;

public class Product {

    private String code;    //  商品代码
    private double money;   // 商品价格
    private double taxRate; // 商品税率

    public Product() { }

    public Product(String code, double money, double taxRate) {
        this.code = code;
        this.money = money;
        this.taxRate = taxRate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
