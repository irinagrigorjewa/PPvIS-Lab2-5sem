package sample.command;

import sample.BasicInformation;

public class ShowBasicInformationCommand implements Command {
    private BasicInformation basicInformation;

    public ShowBasicInformationCommand() {
    }

    ;

    ShowBasicInformationCommand(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    @Override
    public void run() {

    }
}
