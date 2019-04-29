package _3_Behavioral_Pattern.Exam6.work_2_IteratorPattern;

// 具体聚合类
public class ConcreteAggregate implements List {

    private Object[] list;
    private int size = 0;
    private int index = 0;

    public ConcreteAggregate() {
        index = 0;
        size = 0;
        list = new Object[100];
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}
