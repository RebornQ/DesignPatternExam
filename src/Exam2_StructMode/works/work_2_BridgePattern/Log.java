package Exam2_StructMode.works.work_2_BridgePattern;

public abstract class Log {

    protected LogImpl log;

    protected ProgrammingLanguageImpl programmingLanguage;

    public void setLog(LogImpl log) {
        this.log = log;
    }

    public void setProgrammingLanguage(ProgrammingLanguageImpl programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public abstract void parseLogFileType(String fileName);
}
