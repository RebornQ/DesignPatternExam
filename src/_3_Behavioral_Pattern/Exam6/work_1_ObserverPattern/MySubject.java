package _3_Behavioral_Pattern.Exam6.work_1_ObserverPattern;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList<MyObserver> observers = new ArrayList<>();

    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    public void detach(MyObserver observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers();
}
