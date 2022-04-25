import Controller.MapController;
import Model.MapModel;
import View.MainView;
import View.MapView;

import javax.swing.*;

/*
The "model" is your core application. Everything your application can do is in the model.
The "view" is there to visualize what's going on and provide a user interface.
The "controller" is the glue needed to react to events and instruct the model and view what to do.
*/

/*
TODO: change the names of the classes in the different parts in MVC, they should not all be named Controller and so on at the end. There should be a better way of doing this
*/


public class App {

    public mainController mainController;

    public App() {
        MainView mainView = new MainView();

        MapModel mapModel = new MapModel(1);
        MapView mapView = new MapView();
        new MapController(mapModel, mapView, mainView);

    }

    public static void main(String[] args) {
        new App().runGame();
    }

    public void runGame() {
        mainController.draw();
        while (true) {
            mainController.update();
        }
    }

}
