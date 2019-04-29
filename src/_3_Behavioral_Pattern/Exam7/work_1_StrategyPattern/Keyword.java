package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern;

import java.util.Random;

/**
 * 这段代码打算根据不同的choice来选择不同的find方法执行，
 * 但这种设计方案不符合开闭原则，
 * 请使用策略模式来重新设计以上的类。
 */
public class Keyword {

    public static void main(String[] args) {
        int choice = -1;
        Random random = new Random();
        choice = random.nextInt(6);
        String word = "Test";

        FindContext findContext = new FindContext();
        if(choice==1) findContext.setFindStrategy(new ConcreteFind1());
        else if (choice==2) findContext.setFindStrategy(new ConcreteFind2());
        else if (choice==3) findContext.setFindStrategy(new ConcreteFind3());
        else if (choice==4) findContext.setFindStrategy(new ConcreteFind4());
        else findContext.setFindStrategy(new ConcreteFind5());
        findContext.find(word);
    }
}