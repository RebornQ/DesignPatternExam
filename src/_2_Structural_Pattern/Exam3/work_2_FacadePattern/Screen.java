package _2_Structural_Pattern.Exam3.work_2_FacadePattern;

public class Screen extends Device {
    @Override
    public void powerOn() {
        System.out.println("开幕布了！");
    }

    @Override
    public void powerOff() {
        System.out.println("关幕布了！");
    }
}