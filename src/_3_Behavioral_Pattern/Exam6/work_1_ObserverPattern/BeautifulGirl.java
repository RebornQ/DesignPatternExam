package _3_Behavioral_Pattern.Exam6.work_1_ObserverPattern;

public class BeautifulGirl extends MySubject {

    @Override
    public void notifyObservers() {
        System.out.println("我状态更新啦~");
        for (MyObserver observer : observers) {
            observer.response();
        }
    }
}
