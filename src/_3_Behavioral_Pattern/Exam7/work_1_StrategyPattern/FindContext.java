package _3_Behavioral_Pattern.Exam7.work_1_StrategyPattern;

public class FindContext {

    private FindStrategy findStrategy;

    public void setFindStrategy(FindStrategy findStrategy) {
        this.findStrategy = findStrategy;
    }

    public String find(String word) {
        return findStrategy.find(word);
    }
}
