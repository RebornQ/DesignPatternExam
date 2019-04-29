package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern;

public class SideDish extends Food {

    private Food food;

    public SideDish(Food food) {
        this.food = food;
    }

    @Override
    public void chooseNoodlesType() {
        food.chooseNoodlesType();
    }
}
