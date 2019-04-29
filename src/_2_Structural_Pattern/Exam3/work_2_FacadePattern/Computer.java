package _2_Structural_Pattern.Exam3.work_2_FacadePattern;

public class Computer extends Device {
    @Override
    public void powerOn() {
        System.out.println("开电脑了！");
    }

    @Override
    public void powerOff() {
        System.out.println("关电脑了！");
    }
}