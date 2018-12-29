package Piece;

import Board.Board;
/*
Not sure about extending but it is giving an error about BufferedImage
not having a default constructor. One solution was to create an additional
wrapper class in order to use it but not sure what to do
 */

import java.awt.image.BufferedImage;

public abstract class Piece {
    int x;
    int y;


    abstract void move();

    abstract boolean validMove();

    public Piece(int x, int y) {
        this.x = x;
        this.y =y;
    }
}
