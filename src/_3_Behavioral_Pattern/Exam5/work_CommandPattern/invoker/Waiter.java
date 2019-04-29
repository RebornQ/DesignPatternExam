package _3_Behavioral_Pattern.Exam5.work_CommandPattern.invoker;


import _3_Behavioral_Pattern.Exam5.work_CommandPattern.command.BBQCommand;

import java.util.ArrayList;
import java.util.List;

/***
 * 调用者
 */
public class Waiter {

    private List<BBQCommand> commands;

    public Waiter() {
        commands = new ArrayList<>();
    }

//    public Waiter(BBQCommand command) {
//        this.command = command;
//    }
//
//    public void setCommand(BBQCommand command) {
//        this.command = command;
//    }

    public void addCommand(BBQCommand command) {
        commands.add(command);
    }

    public void execute() {
        for (BBQCommand command:
                commands) {
            command.barbecue();
        }
    }
}
