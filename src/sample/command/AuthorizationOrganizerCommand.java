package sample.command;

import sample.Protester;

public class AuthorizationOrganizerCommand implements Command {
    Protester protester;

    public AuthorizationOrganizerCommand() {
    }

    ;

    public AuthorizationOrganizerCommand(Protester protester) {
        this.protester = protester;
    }

    @Override
    public void run() {

    }

}
