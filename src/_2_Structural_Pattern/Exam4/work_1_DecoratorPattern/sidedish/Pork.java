package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.sidedish;

import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.Food;
import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.SideDish;

public class Pork extends SideDish {

    private static final int ID = 4;

    private static final double PRICE = 3;

    public Pork(Food food) {
        super(food);
        foodId = ID;
        foodPrice = PRICE;
    }

    @Override
    public void chooseNoodlesType() {
        super.chooseNoodlesType();
        addPork();
    }

    public void addPork() {
        System.out.println("加猪肉！");
    }
}
