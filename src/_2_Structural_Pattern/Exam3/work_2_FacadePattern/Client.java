package _2_Structural_Pattern.Exam3.work_2_FacadePattern;

public class Client {
    public static void main(String[] args) {
        Button button = new Button();
        button.powerOn();
        button.powerOff();
    }
}
