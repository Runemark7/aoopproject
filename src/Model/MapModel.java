package Model;

import View.Tile;

public class MapModel {
    private int mapID;
    private Tile[][] mapGrid;
    private int height;
    private int width;

    public MapModel(int mapID) {
        this.mapID = mapID;
        this.mapGrid = new Tile[10][10];
        this.height = 10;
        this.width = 10;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapGrid[i][j] = new Tile(0);
            }
        }
    }

    public int getMapID() {
        return mapID;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Tile[][] getMap() {
        return mapGrid;
    }
}
