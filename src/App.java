import Controller.MapController;
import Model.MapModel;
import View.MainView;
import View.MapView;

/*
The "model" is your core application. Everything your application can do is in the model.
The "view" is there to visualize what's going on and provide a user interface.
The "controller" is the glue needed to react to events and instruct the model and view what to do.
*/

public class App {

    public MapController mainController;

    public App() {
        MainView mainView = new MainView();

        MapModel mapModel = new MapModel(0);
        MapView mapView = new MapView();
        MapController mainController = new MapController(mapModel, mapView, mainView);

        mainView.addKeyListener(mainController);
        this.mainController = mainController;
    }

    public static void main(String[] args) {
        new App().runGame();
    }

    public void runGame() {
        mainController.draw();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000/60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        while (thread != null) {
            mainController.update();
        }

    }

}
