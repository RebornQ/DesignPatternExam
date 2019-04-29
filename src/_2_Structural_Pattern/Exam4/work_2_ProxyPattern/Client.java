package _2_Structural_Pattern.Exam4.work_2_ProxyPattern;

public class Client {
    public static void main(String[] args) {
        Business business = new Proxy();
        for (int i = 0; i < 10; i++) {
            business.method();
        }
    }
}
