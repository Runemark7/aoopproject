package View;

import javax.swing.*;
import java.awt.*;

//TODO: make this class generic and extend it to the different blocktypes, for example a blocktype for a wall should not be movable

public class Tile extends JLabel {
    private ImageIcon imgIcon;
    private int tileType;
    private boolean movable;
    private boolean isOccupied;
    private int prevTileType;


    public Tile(int tileType) {
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

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public void setPrevTileType(int prevTileType) {
        this.prevTileType = prevTileType;
    }

    public boolean move(Tile prevTile, Tile moveToTile) {
        if (moveToTile.isMovable()) {
            moveToTile.setOccupied(true);
            moveToTile.setPrevTileType(moveToTile.getTileType());
            moveToTile.setTileType(9); //change to player
            prevTile.setTileType(prevTile.getPrevTileType());
            return true;
        }else{
            System.out.println("You can't move there");
            return false;
        }
    }

    private int getPrevTileType() {
        return prevTileType;
    }

    private int getTileType() {
        return tileType;
    }

    private boolean isMovable() {
        return movable;
    }
}
