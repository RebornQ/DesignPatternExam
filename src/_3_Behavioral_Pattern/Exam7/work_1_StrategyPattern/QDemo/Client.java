package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern.QDemo;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        double money = 0;
        System.out.println("请输入商品钱钱：");
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextDouble();
        context.setStrategy(new ConcreteStrategyCommon());
        System.out.println("收到的钱钱："+context.Algorithm(money));
    }
}
