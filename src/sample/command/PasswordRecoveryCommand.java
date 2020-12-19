package sample.command;

import sample.command.Command;

public class PasswordRecoveryCommand implements Command {
    private String email;

    PasswordRecoveryCommand(String email) {
        this.email = email;
    }

    @Override
    public void run() {

    }
}
