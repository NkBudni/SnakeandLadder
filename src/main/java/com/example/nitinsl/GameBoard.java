package com.example.nitinsl;

import javafx.util.Pair;

import java.util.ArrayList;

public class GameBoard {
    static int tilesize = 40;
    static int height = 10;
    static int width = 10;

    static ArrayList<Pair<Integer,Integer>>positionCoordinates;///storing x,y coordinations

    static ArrayList<Integer>snakeLadderPosition;
    public GameBoard()
    {
        populatePositionCoordinates();
        setPositionCoordinates();
    }
    public int getXValue(int piecePosition){
        return positionCoordinates.get(piecePosition).getKey();
    }
    public int getYValue(int piecePosition){
        return positionCoordinates.get(piecePosition).getValue();
    }

    public int playPostionAtSnakeOrLedder(int piecePosition) {
        if (piecePosition != snakeLadderPosition.get(piecePosition)) { //element of indexes is not equal to index itself
            return snakeLadderPosition.get(piecePosition);
        }
        return -1;
    }
    //private static void populatePositionCoordinates(){...}

    private void setPositionCoordinates(){
        snakeLadderPosition = new ArrayList<>();
        for (int i = 0; i < 101; i++) {//every index have the same element
            snakeLadderPosition.add(i);
        }

       snakeLadderPosition.set(1,38);
        snakeLadderPosition.set(4,14);
        snakeLadderPosition.set(9,31);
        snakeLadderPosition.set(17,7);
        snakeLadderPosition.set(21,42);
        snakeLadderPosition.set(28,84);
        snakeLadderPosition.set(51,67);
        snakeLadderPosition.set(54,34);
        snakeLadderPosition.set(62,19);
        snakeLadderPosition.set(64,60);
        snakeLadderPosition.set(72,91);
        snakeLadderPosition.set(80,99);
        snakeLadderPosition.set(87,36);
        snakeLadderPosition.set(93,73);
        snakeLadderPosition.set(95,75);
        snakeLadderPosition.set(98,79);


    }

    private static void populatePositionCoordinates(){  //pointing cental in the tile
        positionCoordinates = new ArrayList<>();
        positionCoordinates.add(new Pair<Integer,Integer>(380,20));
        // 20,380
        int xTilePos, yTilePos;
        for(int i= height-1;i>=0;i--){
            for(int j = width-1;j>=0;j--){
                if(i%2 != 0)
                {
                    xTilePos = tilesize*width - (tilesize/2 + j*tilesize);
                }
                else {
                    xTilePos = tilesize/2 + j*tilesize;
                }

                yTilePos = tilesize/2 + i*tilesize;
                positionCoordinates.add(new Pair<Integer,Integer>(xTilePos,yTilePos));
            }
        }
        for (int i=0;i< positionCoordinates.size();i++)
        {
            System.out.println(i + "x: " + positionCoordinates.get(i).getKey() + "y: " + positionCoordinates.get(i).getValue());


        }
    }

    public static void main(String[] args) {
        populatePositionCoordinates();
    }
}