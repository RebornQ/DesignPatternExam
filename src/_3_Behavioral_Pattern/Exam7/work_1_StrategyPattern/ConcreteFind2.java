package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern;

// 具体策略类
public class ConcreteFind2 extends FindStrategy {

    @Override
    public String find(String word) {
        System.out.println(word + ": 方法2");
        return null;
    }
}