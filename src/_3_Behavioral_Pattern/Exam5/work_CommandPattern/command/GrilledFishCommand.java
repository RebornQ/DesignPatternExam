package _3_Behavioral_Pattern.Exam5.work_CommandPattern.command;

import _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver.FishBooth;

/***
 * 具体命令类
 */
public class GrilledFishCommand extends BBQCommand{

    private FishBooth fishBooth;

    public GrilledFishCommand(FishBooth fishBooth) {
        this.fishBooth = fishBooth;
    }

    @Override
    public void barbecue() {
        fishBooth.fish();
    }
}
