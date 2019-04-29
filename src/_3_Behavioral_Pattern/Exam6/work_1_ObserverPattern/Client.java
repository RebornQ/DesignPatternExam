package _3_Behavioral_Pattern.Exam6.work_1_ObserverPattern;

public class Client {
    public static void main(String[] args) {
        MyObserver suitor1 = new Suitor(1);
        MyObserver suitor2 = new Suitor(2);
        MyObserver suitor3 = new Suitor(3);
        MySubject girl = new BeautifulGirl();
        girl.attach(suitor1);
        girl.attach(suitor2);
        girl.attach(suitor3);
        girl.notifyObservers();
    }
}
