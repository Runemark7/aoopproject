package View;

import javax.swing.*;
import java.awt.*;

public class Tile extends JLabel {
    private ImageIcon imgIcon;
    private int tileType;
    private boolean movable;


    public Tile(int tileType) {
        this.tileType = tileType;
        setTileType(tileType);
    }

    public void setTileType(int tileType) {


        switch (tileType) {
            case 0:
                imgIcon = new ImageIcon("C:\\Users\\Alexander\\IdeaProjects\\aoopProject\\src\\assets\\blank.png");
                break;
            case 1:
                imgIcon = new ImageIcon("C:\\Users\\Alexander\\IdeaProjects\\aoopProject\\src\\assets\\blankmarked.png");
                break;
            case 2:
                imgIcon = new ImageIcon("src/assets/crate.png");
                break;
            case 3:
                imgIcon = new ImageIcon("src/assets/cratemarked.png");
                break;
            case 4:
                imgIcon = new ImageIcon("src/assets/wall.png");
                break;
            case 9:
                imgIcon = new ImageIcon("src/assets/player.png");
                break;
        }
        this.movable = true;
        setVisible(true);
        imgIcon.setImage(imgIcon.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        setOpaque(true);
        setBackground(Color.green);
        setIcon(imgIcon);
        repaint();
    }

    public void moveUp(Tile tile) {
        if (tile.isMovable()) {
            tile.setTileType(9);
        }else{
            System.out.println("You can't move there");
        }
    }

    private boolean isMovable() {
        return movable;
    }
}
