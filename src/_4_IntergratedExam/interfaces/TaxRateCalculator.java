package _4_IntergratedExam.interfaces;



import _4_IntergratedExam.bean.Product;

import java.util.ArrayList;

// 国家进出口税率系统
public class TaxRateCalculator {

    // 海关系统中存储的商品列表
    protected ArrayList<Product> products = new ArrayList<>();

    public TaxRateCalculator() {
        setProducts();
    }

    // 查询税率
    public double checkTaxRate(String code){
        for (Product product : products) {
            if (product.getCode().equals(code)) {
                return product.getTaxRate();
            }
        }
        return -1;
    }

    // 添加商品
    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts() {
        Product product1 = new Product("pd1", 100, 0.13);
        Product product2 = new Product("pd2", 500, 0.33);
        Product product3 = new Product("pd3", 300, 0.23);
        addProduct(product1);
        addProduct(product2);
        addProduct(product3);
    }
}
