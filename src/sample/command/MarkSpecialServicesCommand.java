package sample.command;

import sample.SpecialServices;
import sample.command.Command;

public class MarkSpecialServicesCommand implements Command {
    private SpecialServices specialServices;

    MarkSpecialServicesCommand(SpecialServices specialServices) {
        this.specialServices = specialServices;
    }

    @Override
    public void run() {

    }
}
