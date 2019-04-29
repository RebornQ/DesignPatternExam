package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern.QDemo;

// 正常收费
public class ConcreteStrategyCommon extends AbstractStrategy {

    @Override
    public double Algorithm(double money) {
            return money;
    }
}
