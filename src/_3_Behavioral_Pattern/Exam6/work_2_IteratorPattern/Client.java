package _3_Behavioral_Pattern.Exam6.work_2_IteratorPattern;

public class Client {
    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add(1);
        list.add(2);
        list.add("3");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
