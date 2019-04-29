package _3_Behavioral_Pattern.Exam6.work_2_IteratorPattern;

// 具体迭代器
public class ConcreteIterator implements Iterator {

    private List list = null;

    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) return false;
        else return true;
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}
