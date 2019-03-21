package Exam1_InnovationMode.works.work_1_FactoryMethodPattern.factory;


import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.player.Computer;
import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.player.Human;
import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.player.Player;
import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.playmode.EasyMode;
import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.playmode.HardMode;
import Exam1_InnovationMode.works.work_1_FactoryMethodPattern.playmode.PlayMode;

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
