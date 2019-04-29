package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.noodle;

import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.Food;

public class NormalNoodle extends Food {

    private static final int ID = 0;
    private static final double PRICE = 10;

    public NormalNoodle() {
        this.foodId = ID;
        this.foodPrice = PRICE;
    }

    @Override
    public void chooseNoodlesType() {
        System.out.println("顾客选择了面条");
    }
}
