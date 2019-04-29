package _2_Structural_Pattern.Exam3.work_1_CompositePattern;

import java.util.ArrayList;

public class Place extends Organization {

    private ArrayList<Organization> organizations;

    public Place(String placeName) {
        name = placeName;
        organizations = new ArrayList<>();
    }

    @Override
    public void add(Organization o) {
        organizations.add(o);
    }

    @Override
    public void remove(Organization o) {
        organizations.remove(o);
    }

    @Override
    public Organization getChild(int i) {
        return organizations.get(i);
    }

    @Override
    public void send(String content) {
        for (Object o : organizations) {
            System.out.println("正在对"+((Organization) o).getName()+"下发公文");
            ((Organization) o).send(content);

        }
    }

}
