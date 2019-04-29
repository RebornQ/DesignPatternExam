package _3_Behavioral_Pattern.Exam6.work_2_IteratorPattern;

// 抽象聚合类, 定义集合可以进行的操作
public interface List {
    void add(Object obj);

    Object get(int index);

    Iterator iterator();

    int getSize();
}