package Exam2_StructMode.works.work_2_BridgePattern;

public class WindowsLogImpl implements LogImpl {
    @Override
    public void print(String content) {
        System.out.println("Windows输出："+content);
    }
}
