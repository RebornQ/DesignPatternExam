package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern;

public abstract class Food {

    protected int foodId;

    protected double foodPrice;

    public abstract void chooseNoodlesType();

    public int getFoodId() {
        return foodId;
    }
}
