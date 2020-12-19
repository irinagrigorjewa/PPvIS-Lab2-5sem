package sample.command;

import sample.BasicInformation;

public class AddBasicInformationCommand implements Command {
    public BasicInformation basicInformation;

    public AddBasicInformationCommand() {

    }

    public AddBasicInformationCommand(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    @Override
    public void run() {

    }
}
