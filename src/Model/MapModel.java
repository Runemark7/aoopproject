package Model;

import View.Tile;

import java.io.*;
import java.util.ArrayList;

public class MapModel {
    private int mapID;
    private ArrayList<ArrayList<Tile>> mapGrid;
    private int height;
    private int width;
    private int playerX;
    private int playerY;
    private int boxesUntilWin;

    public MapModel(){
        this.mapID = 0;
        getMapFromFile(mapID);
    }

    public MapModel(int mapID) {
        this.mapID = mapID;
        getMapFromFile(mapID);
    }

    public boolean changeMap(int mapID){
        this.mapID = mapID;
        this.mapGrid = getMapFromFile(mapID);
        if (mapGrid.size() > 0) {
            return true;
        }
        return false;
    }

    public ArrayList<ArrayList<Tile>> getMapFromFile(int level) {
        mapGrid = new ArrayList<>();
        File file = new File("src/assets/levels/"+ level +".txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int boxesUntilWin = 0;
            String st;
            while ((st = reader.readLine()) != null){
                ArrayList<Tile> row = new ArrayList<Tile>();
                for (int i = 0; i < st.length(); i++) {
                    int tileID = Integer.parseInt(String.valueOf(st.charAt(i)));
                    //TODO: maybe should move the setTileType switch/case to this file???
                    if (tileID == 1) {
                        boxesUntilWin++;
                    }
                    if (tileID == 9) {
                        playerX = i;
                        playerY = mapGrid.size();
                    }
                    Tile newTile = new Tile(tileID);
                    row.add(newTile);
                }
                mapGrid.add(row);
            }
            reader.close();
            this.boxesUntilWin = boxesUntilWin;
            this.height = mapGrid.size();
            this.width = mapGrid.get(0).size();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mapGrid;
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

    public ArrayList<ArrayList<Tile>> getMap() {
        return mapGrid;
    }

    public void moveUp() {
        if(mapGrid.get(playerY).get(playerX).move(mapGrid.get(playerY).get(playerX),mapGrid.get(playerY - 1).get(playerX))) {
            playerY--;
        }
    }

    public void moveDown() {
        if (mapGrid.get(playerY).get(playerX).move(mapGrid.get(playerY).get(playerX),mapGrid.get(playerY + 1).get(playerX))){
            playerY++;
        }
    }

    public void moveLeft() {
        if(mapGrid.get(playerY).get(playerX).move(mapGrid.get(playerY).get(playerX),mapGrid.get(playerY).get(playerX - 1))){
            playerX--;
        }
    }

    public void moveRight() {
        if(mapGrid.get(playerY).get(playerX).move(mapGrid.get(playerY).get(playerX),mapGrid.get(playerY).get(playerX + 1))){
            playerX++;
        }
    }
}
