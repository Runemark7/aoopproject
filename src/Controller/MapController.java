package Controller;

import Model.MapModel;
import View.MapView;
import javax.swing.*;

public class MapController extends KeyControllers{

    private static MapModel mapModel;
    private static MapView mapView;
    private JFrame frame;

    public MapController(MapModel mapModel, MapView mapView, JFrame frame) {
        this.mapModel = mapModel;
        this.mapView = mapView;
        this.frame = frame;
    }

    public void update() {
        if (isUp()) {
            mapModel.moveUp();
        }
        if (isDown()) {
            System.out.println("down");
        }
        if (isLeft()) {
            System.out.println("left");
        }
        if (isRight()) {
            System.out.println("right");
        }
    }

    public void draw() {
        frame.add(mapView.drawMap(mapModel.getMap()));
        frame.setVisible(true);
    }
}
