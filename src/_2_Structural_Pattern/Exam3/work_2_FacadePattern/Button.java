package _2_Structural_Pattern.Exam3.work_2_FacadePattern;

public class Button {

    private Device computer, screen, projector, mic, light;

    public Button() {
        computer = new Computer();
        screen = new Screen();
        projector = new Projector();
        mic = new Mic();
        light = new Light();
    }

    public void powerOn() {
        computer.powerOn();
        screen.powerOn();
        projector.powerOn();
        mic.powerOn();
        light.powerOn();
    }

    public void powerOff() {
        computer.powerOff();
        screen.powerOff();
        projector.powerOff();
        mic.powerOff();
        light.powerOff();
    }

}
