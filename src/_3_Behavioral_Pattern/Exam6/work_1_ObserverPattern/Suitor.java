package _3_Behavioral_Pattern.Exam6.work_1_ObserverPattern;

public class Suitor implements MyObserver {

    private int id;

    public Suitor(int id) {
        this.id = id;
    }

    @Override
    public void response() {
        System.out.println("追求者" + id + "：收到啦~");
    }
}
