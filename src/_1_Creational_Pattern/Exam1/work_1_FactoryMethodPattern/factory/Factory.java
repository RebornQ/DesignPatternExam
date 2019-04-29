package _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.factory;


import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.player.Player;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.playmode.EasyMode;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.playmode.HardMode;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.playmode.PlayMode;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.player.Computer;
import _1_Creational_Pattern.Exam1.work_1_FactoryMethodPattern.player.Human;

// 简单工厂模式
public class Factory {

    public Player createPlayer(int playerType) {
        if (playerType == 0) {
            return new Human();
        } else if (playerType == 1) {
            return new Computer();
        }
        return null;
    }

    public PlayMode createMode(int mode) {
        if (mode == 0) {
            return new EasyMode();
        } else if (mode == 1) {
            return new HardMode();
        }
        return null;
    }
}
