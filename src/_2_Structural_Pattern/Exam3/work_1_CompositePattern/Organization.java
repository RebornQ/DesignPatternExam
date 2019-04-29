package _2_Structural_Pattern.Exam3.work_1_CompositePattern;

public abstract class Organization {

    protected String name;

    public abstract void add(Organization o);

    public abstract void remove(Organization o);

    public abstract Organization getChild(int i);

    public abstract void send(String content);

    public String getName() {
        return name;
    }
}
