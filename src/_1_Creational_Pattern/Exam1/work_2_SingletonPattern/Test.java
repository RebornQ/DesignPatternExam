package _1_Creational_Pattern.Exam1.work_2_SingletonPattern;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Multiton multiton = Multiton.getInstance();
            System.out.println("当前："+multiton.getTAG());
        }
    }
}
