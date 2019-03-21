package Exam1_InnovationMode.works.work_2_SingletonPattern;

import java.util.ArrayList;
import java.util.Random;

public class Multiton {

    private String TAG;
    /**
     * maxOfInstance: 允许产生的最大实例数.
     */
    private static int maxOfInstance = 2;

    /**
     * multitons: 装所有实例的List.
     */
    private static ArrayList<Multiton> multitons = new ArrayList<>(maxOfInstance);


    /**
     * multitons: 装所有实例名的List.
     */
//    private static ArrayList<String> multitonInfoList = new ArrayList<>(maxOfInstance);


    /**
     * currentNumOfInstances: 当前实例的编号.
     */
    private static int currentNumOfInstances = 0;

    private Multiton() {

    }

    private Multiton(String info) {
//        multitonInfoList.add(info);
        TAG = info;
    }

    static {
        for (int i = 0; i < maxOfInstance; i++) {
            multitons.add(new Multiton("第"+ (i+1) +"个实例"));
        }
    }

    public static Multiton getInstance() {
        Random random = new Random();
        currentNumOfInstances = random.nextInt(maxOfInstance);
        return multitons.get(currentNumOfInstances);
    }

    public String getTAG() {
        return TAG;
    }
}
