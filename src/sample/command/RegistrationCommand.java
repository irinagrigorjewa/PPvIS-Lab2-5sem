package sample.command;

import sample.Protester;
import sample.command.Command;

public class RegistrationCommand implements Command {
    private Protester protester;

    RegistrationCommand(Protester protester) {
        this.protester = protester;

    }

    @Override
    public void run() {

    }

}
