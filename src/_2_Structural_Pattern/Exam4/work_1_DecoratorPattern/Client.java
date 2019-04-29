package _2_Structural_Pattern.Exam4.work_1_DecoratorPattern;


import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.noodle.NormalNoodle;
import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.sidedish.Beef;
import _2_Structural_Pattern.Exam4.work_1_DecoratorPattern.sidedish.Pork;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        double priceSum = 0;
        List<Food> foodList = new ArrayList<>();
        Food noodle = new NormalNoodle();
        foodList.add(noodle);
        SideDish pork = new Pork(noodle);
        foodList.add(pork);
        SideDish beef = new Beef(noodle);
        foodList.add(beef);
        for (Food food : foodList) {
            food.chooseNoodlesType();
            priceSum += food.foodPrice;
        }
        System.out.println("总价为" + priceSum);
    }
}
