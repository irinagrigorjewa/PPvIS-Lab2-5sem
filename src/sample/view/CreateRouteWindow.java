package sample.view;


import javafx.util.Pair;
import sample.Map;

public class CreateRouteWindow implements Window {
    private Map map;
    private Pair<Float, Float> startLocate;
    private Pair<Float, Float> endLocate;

    public CreateRouteWindow() {
    }

    ;

    CreateRouteWindow(Map map, Pair startLocate, Pair endLocate) {
        this.map = map;
        this.startLocate = startLocate;
        this.endLocate = endLocate;
    }

    public void handleEvent() {
    }

    public void onConfirmCreateRouteButton() {

    }
}
