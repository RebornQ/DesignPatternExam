package _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver;

/***
 * 接收者
 */
public class FishBooth {

    private static FishBooth instance = null;

    private FishBooth() { }

    public void fish() {
        System.out.println("烤鱼");
    }

    public static FishBooth getInstance() {
        if (instance == null) {
            instance = new FishBooth();
        }
        return instance;
    }
}
