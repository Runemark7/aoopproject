package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MapView {

    public JPanel drawMap(ArrayList<ArrayList<Tile>> mapGrid) {
        JPanel mapPanel = new JPanel();
        int rows = mapGrid.size();
        int cols = mapGrid.get(0).size();
        mapPanel.setLayout(new GridLayout(rows, cols));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mapPanel.add(mapGrid.get(i).get(j));
            }
        }
        mapPanel.setLayout(new GridLayout(rows, cols));
        mapPanel.setPreferredSize(new Dimension(cols * 32, rows * 32));
        mapPanel.setBackground(Color.BLACK);
        return mapPanel;
    }

}
