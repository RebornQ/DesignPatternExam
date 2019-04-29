package _2_Structural_Pattern.Exam2.work_2_BridgePattern;

public class Client {
    public static void main(String[] args) {
        Log log = new TXTLog();
        LogImpl linuxLog = new LinuxLogImpl();
        ProgrammingLanguageImpl java = new JavaImpl();
        log.setLog(linuxLog);
        log.setProgrammingLanguage(java);
        log.parseLogFileType("Log");
        log.log.print("啦啦啦~");
        log.programmingLanguage.printProgrammingLanguage();
    }
}
