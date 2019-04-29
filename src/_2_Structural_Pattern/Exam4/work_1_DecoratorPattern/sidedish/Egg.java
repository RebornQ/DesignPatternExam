package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.sidedish;

import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.Food;
import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.SideDish;

public class Egg extends SideDish {

    private static final int ID = 5;

    private static final double PRICE = 2;

    public Egg(Food food) {
        super(food);
        foodId = ID;
        foodPrice = PRICE;
    }

    @Override
    public void chooseNoodlesType() {
        super.chooseNoodlesType();
        addEgg();
    }

    public void addEgg() {
        System.out.println("加鸡蛋！");
    }
}
