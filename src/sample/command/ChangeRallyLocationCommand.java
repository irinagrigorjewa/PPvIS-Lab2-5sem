package sample.command;

import sample.Rally;

public class ChangeRallyLocationCommand implements Command {
    Rally rally;

    ChangeRallyLocationCommand(Rally rally) {
        this.rally = rally;
    }

    @Override
    public void run() {

    }
}
