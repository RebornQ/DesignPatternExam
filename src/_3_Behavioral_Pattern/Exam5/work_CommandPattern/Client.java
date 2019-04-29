package _3_Behavioral_Pattern.Exam5.work_CommandPattern;


import _3_Behavioral_Pattern.Exam5.work_CommandPattern.command.BBQCommand;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.command.BakedChickenWingsCommand;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.command.GrilledFishCommand;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.command.KebabCommand;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.invoker.Waiter;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver.FishBooth;
import _3_Behavioral_Pattern.Exam5.work_CommandPattern.receiver.MeatBooth;

public class Client {

    public static void main(String[] args) {
        // 创建命令的接受者
        FishBooth fishBooth;
        fishBooth = FishBooth.getInstance();
        MeatBooth meatBooth = MeatBooth.getInstance();
        // 创建命令对象，并设定它的接受者
        BBQCommand grilledFishCommand = new GrilledFishCommand(fishBooth);
        BBQCommand kebabCommand = new KebabCommand(meatBooth);
        BBQCommand bakedChickenWingsCommand = new BakedChickenWingsCommand(meatBooth);
        // 创建命令执行者，并将相应的命令作为参数传递给Waiter
        Waiter waiter = new Waiter();
        waiter.addCommand(grilledFishCommand);
        waiter.addCommand(kebabCommand);
        waiter.addCommand(bakedChickenWingsCommand);
        // Client端测试一下
        waiter.execute();
    }
}
