package game;

import piece.Piece;

import java.util.ArrayList;

public class Player {
    public enum PlayerColor {
        RED,
        BLACK
    }

    private PlayerColor color;
    private ArrayList<Piece> pieces;

    public Player(PlayerColor color) {
        this.color = color;
    }

    public void addPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public PlayerColor getColor() {
        return color;
    }
}
