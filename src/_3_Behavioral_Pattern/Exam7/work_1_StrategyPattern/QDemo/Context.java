package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern.QDemo;


public class Context {

    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public double Algorithm(double money) {
        return strategy.Algorithm(money);
    }
}
