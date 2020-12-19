package sample.command;

import sample.Rally;
import sample.command.Command;

public class CreateRallyCommand implements Command {
    private Rally rally;

    public CreateRallyCommand() {
    }

    ;

    CreateRallyCommand(Rally rally) {
        this.rally = rally;
    }

    @Override
    public void run() {

    }
}
