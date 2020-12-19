package sample.command;

import sample.Protester;

public class AddProtesterToOrganizerCommand implements Command {
    private Protester protester;

    public AddProtesterToOrganizerCommand() {
    }

    ;

    AddProtesterToOrganizerCommand(Protester protester) {
        this.protester = protester;

    }

    @Override
    public void run() {

    }
}
