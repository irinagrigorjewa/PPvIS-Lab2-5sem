package sample.command;

import javafx.util.Pair;
import sample.Map;
import sample.Rally;

public class CreateRouteCommand implements Command {
    private Map map;
    Pair<Float, Float> startLocate;
    Pair<Float, Float> endLocate;

    public CreateRouteCommand() {
    }

    ;

    CreateRouteCommand(Map map, Pair<Float, Float> startLocate,
                       Pair<Float, Float> endLocate) {
        this.startLocate = startLocate;
        this.endLocate = endLocate;
        this.map = map;
    }

    @Override
    public void run() {

    }

    void CreateOptimalRoute() {

    }

    void CreateSafeRoute() {

    }
}
