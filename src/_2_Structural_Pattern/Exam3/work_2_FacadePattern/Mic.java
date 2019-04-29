package _2_Structural_Pattern.Exam3.work_2_FacadePattern;

public class Mic extends Device {
    @Override
    public void powerOn() {
        System.out.println("开麦克风了！");
    }

    @Override
    public void powerOff() {
        System.out.println("关麦克风了！");
    }
}