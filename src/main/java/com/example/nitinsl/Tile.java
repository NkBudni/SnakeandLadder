package com.example.nitinsl;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;//rectangle is shape provided by javafx

public class Tile extends Rectangle {
    public Tile(int width,int height)
    {
        setWidth(width);
        setHeight(height);
        setFill(Color.RED);//tile color
        setStroke(Color.BLACK);//bounday color
    }
}

