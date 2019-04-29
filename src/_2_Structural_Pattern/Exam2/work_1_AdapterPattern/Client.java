package _2_Structural_Pattern.Exam2.work_1_AdapterPattern;

public class Client {
    public static void main(String[] args) {
        C c = new ZipCodeObjectAdapter(new U());
        System.out.println(c.zipCode(12345));

        C c1 = new ZipCodeClassAdapter();
        System.out.println(c1.zipCode(123456));
    }
}
