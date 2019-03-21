package Exam2_StructMode.works.work_2_BridgePattern;

public class LinuxLogImpl implements LogImpl {
    @Override
    public void print(String content) {
        System.out.println("Linux输出Log内容为："+content);
    }
}
