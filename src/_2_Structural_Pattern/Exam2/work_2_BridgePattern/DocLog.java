package _2_Structural_Pattern.Exam2.work_2_BridgePattern;

public class DocLog extends Log {

    @Override
    public void parseLogFileType(String fileName) {
//        log.print("输出文件：" + fileName + ".doc");
        System.out.println("输出文件：" + fileName + ".doc");
    }
}
