package View;

import javax.swing.*;
import java.awt.*;

public class Tile extends JLabel {
    private ImageIcon imgIcon;
    private int tileType;
    private boolean moovable;

    public Tile(int tileType) {
        this.tileType = tileType;
        setTileType(tileType);
    }

    public void setTileType(int tileType) {
        setVisible(true);
        setSize(new Dimension(50, 50));
        setOpaque(true);
        setBackground(Color.green);

        switch (tileType) {
            case 0:
                imgIcon = new ImageIcon("C:\\Users\\Alexander\\IdeaProjects\\aoopProject\\src\\assets\\blank.png");
                this.moovable = false;
                break;
            case 1:
                imgIcon = new ImageIcon("src/assets/blankmarked.png");
                break;
            case 2:
                imgIcon = new ImageIcon("src/assets/create.png");
                break;
            case 3:
                imgIcon = new ImageIcon("src/assets/createmarked.png");
                break;
            case 4:
                imgIcon = new ImageIcon("src/assets/wall.png");
                break;
        }
        ImageIcon scaledIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
        setIcon(scaledIcon);
        repaint();
    }
}
