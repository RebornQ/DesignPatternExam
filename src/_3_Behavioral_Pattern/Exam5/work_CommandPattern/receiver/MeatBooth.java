package _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver;

/***
 * 接收者
 */
public class MeatBooth {

    private static MeatBooth instance = null;

    private MeatBooth() { }

    public void kebab() {
        System.out.println("烤肉串");
    }

    public void bakedChickenWings() {
        System.out.println("烤鸡翅");
    }

    public static MeatBooth getInstance() {
        if (instance == null) {
            instance = new MeatBooth();
        }
        return instance;
    }
}
