package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.sidedish;

import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.Food;
import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.SideDish;

public class Beef extends SideDish {

    private static final int ID = 3;

    private static final double PRICE = 5;

    public Beef(Food food) {
        super(food);
        foodId = ID;
        foodPrice = PRICE;
    }

    @Override
    public void chooseNoodlesType() {
        super.chooseNoodlesType();
        addBeef();
    }

    public void addBeef() {
        System.out.println("加牛肉！");
    }
}
