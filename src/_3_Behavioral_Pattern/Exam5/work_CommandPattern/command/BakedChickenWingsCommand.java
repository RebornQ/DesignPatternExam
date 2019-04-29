package _3_Behavioral_Pattern.Exam5.work_CommandPattern.command;

import _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver.MeatBooth;

/***
 * 具体命令类
 */
public class BakedChickenWingsCommand extends BBQCommand{

    private MeatBooth meatBooth;

    public BakedChickenWingsCommand(MeatBooth meatBooth) {
        this.meatBooth = meatBooth;
    }

    @Override
    public void barbecue() {
        meatBooth.bakedChickenWings();
    }
}
