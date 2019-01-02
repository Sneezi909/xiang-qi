package piece;

/*
Not sure about extending but it is giving an error about BufferedImage
not having a default constructor. One solution was to create an additional
wrapper class in order to use it but not sure what to do
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import game.Player.PlayerColor;

public abstract class Piece {
    public enum PieceType {
        PAWN,
        CANNON,
        CAR,
        HORSE,
        ELEPHANT,
        GUARD,
        KING
    }

    private PieceType type;
    private PlayerColor color;

    private int x;
    private int y;

    private boolean dead;

    private BufferedImage img;

    public Piece(int x, int y, PieceType type, PlayerColor color) {
        this(x, y, type, color, null);
    }

    public Piece(int x, int y, PieceType type, PlayerColor color, String path) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.color = color;
        this.dead = false;
        /*
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            //TODO: default image initialization here
        }
        */
    }

    public abstract boolean validMove();

    public void move(int x, int y) {
        if (this.validMove()) {
            this.x = x;
            this.y = y;
        }
    }

    public void remove() {
        this.x = -1;
        this.y = -1;
        this.dead = true;
    }

    public void draw(Graphics g) {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PieceType getType() {
        return type;
    }

    public PlayerColor getColor() {
        return color;
    }

    public boolean isDead() {
        return dead;
    }
}
