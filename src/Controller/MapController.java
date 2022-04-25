package Controller;

import Model.MapModel;
import View.MapView;
import View.MenuView;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class MapController {

    private static MapModel mapModel;
    private static MapView mapView;
    private JFrame frame;

    public MapController(MapModel mapModel, MapView mapView, JFrame frame) {
        this.mapModel = mapModel;
        this.mapView = mapView;
        this.frame = frame;
    }

    public void initializeMapFromFile(int level) {
        File file = new File("src/assets/levels/"+ level +".txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String st;
            int rowIndex = 0;

            while ((st = reader.readLine()) != null){

                //should read the first line and set the map size
                System.out.println(st);
                //foreach char in st read the char and set the map
                for (int i = 0; i < st.length(); i++) {
                    char c = st.charAt(i);

                }
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {

    }

    public void draw() {
        initializeMapFromFile(0);
        initializeMapFromFile(1);

        JPanel theGrid = mapView.drawMap(mapModel.getMap(), mapModel);

        frame.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(theGrid, c);

        c.weightx = 0.0;
        c.weighty = 0.0;
        c.gridx = 1;
        c.gridy = 0;
        frame.add(new MenuView(), c);

        frame.pack();
        frame.repaint();
        frame.update(frame.getGraphics());
    }
}
