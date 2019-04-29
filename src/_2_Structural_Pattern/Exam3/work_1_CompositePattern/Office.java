package _2_Structural_Pattern.Exam3.work_1_CompositePattern;

public class Office extends Organization {

    private String name;

    public Office(String officeName) {
        name = officeName;
    }

    @Override
    public void add(Organization o) { }

    @Override
    public void remove(Organization o) { }

    @Override
    public Organization getChild(int i) {
        return null;
    }

    @Override
    public void send(String content) { }

    public String getName() {
        return name;
    }
}
