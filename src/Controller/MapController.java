package Controller;

import Model.MapModel;
import View.MapView;
import javax.swing.*;

public class MapController extends KeyControllers{

    private MapModel mapModel;
    private MapView mapView;
    private JFrame frame;

    public MapController(MapModel mapModel, MapView mapView, JFrame frame) {
        this.mapModel = mapModel;
        this.mapView = mapView;
        this.frame = frame;
    }

    public void update() {
        if (isUp()) {
            System.out.println("up");
            mapModel.moveUp();
        }
        if (isDown()) {
            System.out.println("down");
            mapModel.moveDown();
        }
        if (isLeft()) {
            System.out.println("left");
            mapModel.moveLeft();
        }
        if (isRight()) {
            System.out.println("right");
            mapModel.moveRight();
        }
    }

    public void draw() {
        frame.add(mapView.drawMap(mapModel.getMap()));
        frame.setVisible(true);
    }
}
