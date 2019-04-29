package _2_Structural_Pattern.Exam2.work_2_BridgePattern;

public class WindowsLogImpl implements LogImpl {
    @Override
    public void print(String content) {
        System.out.println("Windows输出："+content);
    }
}
