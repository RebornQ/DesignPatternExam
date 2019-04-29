package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern.QDemo;

// 满300打折
public class ConcreteStrategyDiscount extends AbstractStrategy {

    @Override
    public double Algorithm(double money) {
        if (money >= 300) {
            return money * 0.8;
        }
        return money;
    }
}
