package _1_Creational_Pattern.Exam1.work_2_SingletonPattern;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
