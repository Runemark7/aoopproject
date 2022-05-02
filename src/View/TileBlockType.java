/*package View;

import javax.swing.*;
import java.awt.*;

abstract public class TileBlockType {
    private ImageIcon imgIcon;
    private int tileType;
    private boolean movable;
    private int isOccupied;
    private int prevTileType;

    public TileBlockType(int tileType) {
        this.tileType = tileType;
        setTileType(tileType);
    }

    public void setTileType(int tileType) {

        switch (tileType) {
            case 0:
                imgIcon = new ImageIcon("C:\\Users\\Alexander\\IdeaProjects\\aoopProject\\src\\assets\\blank.png");
                this.movable = true;
                break;
            case 1:
                imgIcon = new ImageIcon("C:\\Users\\Alexander\\IdeaProjects\\aoopProject\\src\\assets\\blankmarked.png");
                this.movable = true;
                break;
            case 2:
                imgIcon = new ImageIcon("src/assets/crate.png");
                this.movable = true;
                break;
            case 3:
                imgIcon = new ImageIcon("src/assets/cratemarked.png");
                this.movable = false;
                break;
            case 4:
                imgIcon = new ImageIcon("src/assets/wall.png");
                this.movable = false;
                break;
            case 9:
                imgIcon = new ImageIcon("src/assets/player.png");
                this.movable = false;
                break;
        }

        setVisible(true);
        imgIcon.setImage(imgIcon.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        setOpaque(true);
        setBackground(Color.green);
        setIcon(imgIcon);
        repaint();
    }

}

*/