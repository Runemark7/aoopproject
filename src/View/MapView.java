package View;

import Model.MapModel;

import javax.swing.*;
import java.awt.*;

public class MapView {

    public MapView() {

    }

    //should remove the model input and calculate the size of the map on its own
    public JPanel drawMap(Tile[][] mapGrid, MapModel map) {

        JPanel mapPanel = new JPanel();
        mapPanel.setLayout(new GridLayout(map.getHeight(), map.getWidth()));
        for (int i = 0; i < map.getHeight(); i++) {
            for (int j = 0; j < map.getWidth(); j++) {
                mapPanel.add(mapGrid[i][j]);
            }
        }
        mapPanel.setPreferredSize(new Dimension( map.getWidth() *(map.getWidth()* map.getHeight()), map.getHeight() *(map.getWidth())* map.getHeight()));
        mapPanel.setBackground(Color.BLACK);
        return mapPanel;
    }

}
