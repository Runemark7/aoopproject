package Model;

import View.Tile;

import java.io.*;
import java.util.ArrayList;

public class MapModel {
    private int mapID;
    private ArrayList<ArrayList<Tile>> mapGrid;
    private int height;
    private int width;

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

            String st;
            while ((st = reader.readLine()) != null){
                ArrayList<Tile> row = new ArrayList<Tile>();
                for (int i = 0; i < st.length(); i++) {
                    int tileID = Integer.parseInt(String.valueOf(st.charAt(i)));
                    Tile newTile = new Tile(tileID);
                    row.add(newTile);
                }
                mapGrid.add(row);
            }
            reader.close();

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
        for (int i = 0; i < mapGrid.size(); i++) {
            for (int j = 0; j < mapGrid.get(i).size(); j++) {
                mapGrid.get(i).get(j).moveUp(mapGrid.get(i+1).get(j));
            }
        }
    }

    /*public void moveDown() {
        for (int i = 0; i < mapGrid.size(); i++) {
            for (int j = 0; j < mapGrid.get(i).size(); j++) {
                mapGrid.get(i).get(j).moveDown();
            }
        }
    }


    public void moveLeft() {
        for (int i = 0; i < mapGrid.size(); i++) {
            for (int j = 0; j < mapGrid.get(i).size(); j++) {
                mapGrid.get(i).get(j).moveLeft();
            }
        }
    }

    public void moveRight() {
        for (int i = 0; i < mapGrid.size(); i++) {
            for (int j = 0; j < mapGrid.get(i).size(); j++) {
                mapGrid.get(i).get(j).moveRight();
            }
        }
    }*/
}
