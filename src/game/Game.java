package game;

import board.Board;
import piece.*;
import game.Player.PlayerColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Game extends JFrame implements MouseListener {
    private static final int CELL_WIDTH = 50;
    private static int WIDTH;
    private static int HEIGHT;

    private Player p1;
    private Player p2;

    private Board board;

    public Game() {
        super("Xiang Qi");
        board = new Board();
        p1 = new Player(PlayerColor.BLACK);
        p2 = new Player(PlayerColor.RED);

        WIDTH = CELL_WIDTH * Board.GRID_WIDTH + 100;
        HEIGHT = CELL_WIDTH * Board.GRID_HEIGHT + 100;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(board);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);

        initPieces();
    }

    private void initPieces() {
        PlayerColor color1 = p1.getColor();
        PlayerColor color2 = p2.getColor();
        ArrayList<Piece> pieces1 = new ArrayList<>();
        ArrayList<Piece> pieces2 = new ArrayList<>();

        // Add pawns
        for (int i = 0; i < 5; i++) {
            Pawn p = new Pawn(i * 2, 6, color1);
            board.addPiece(p);
            pieces1.add(p);
            p = new Pawn(i * 2, 3, color2);
            board.addPiece(p);
            pieces2.add(p);
        }

        // Add cannons
        Cannon c = new Cannon(1, 7, color1);
        board.addPiece(c);
        pieces1.add(c);
        c = new Cannon(7, 7, color1);
        board.addPiece(c);
        pieces1.add(c);

        c = new Cannon(1, 2, color2);
        board.addPiece(c);
        pieces2.add(c);
        c = new Cannon(7, 2, color2);
        board.addPiece(c);
        pieces2.add(c);

        // Add cars
        Car ca = new Car(0, 9, color1);
        board.addPiece(ca);
        pieces1.add(ca);
        ca = new Car(8, 9, color1);
        board.addPiece(ca);
        pieces1.add(ca);

        ca = new Car(0, 0, color2);
        board.addPiece(ca);
        pieces2.add(ca);
        ca = new Car(8, 0, color2);
        board.addPiece(ca);
        pieces2.add(ca);

        // Add horses
        Horse h = new Horse(1, 9, color1);
        board.addPiece(h);
        pieces1.add(h);
        h = new Horse(7, 9, color1);
        board.addPiece(h);
        pieces1.add(h);

        h = new Horse(1, 0, color2);
        board.addPiece(h);
        pieces2.add(h);
        h = new Horse(7, 0, color2);
        board.addPiece(h);
        pieces2.add(h);

        // Add elephants
        Elephant e = new Elephant(2, 9, color1);
        board.addPiece(e);
        pieces1.add(e);
        e = new Elephant(6, 9, color1);
        board.addPiece(e);
        pieces1.add(e);

        e = new Elephant(2, 0, color2);
        board.addPiece(e);
        pieces2.add(e);
        e = new Elephant(6, 0, color2);
        board.addPiece(e);
        pieces2.add(e);

        // Add guards
        Guard g = new Guard(3, 9, color1);
        board.addPiece(g);
        pieces1.add(g);
        g = new Guard(5, 9, color1);
        board.addPiece(g);
        pieces1.add(g);

        g = new Guard(3, 0, color2);
        board.addPiece(g);
        pieces2.add(g);
        g = new Guard(5, 0, color2);
        board.addPiece(g);
        pieces2.add(g);

        // Add kings
        King k = new King(4, 0, color1);
        board.addPiece(k);
        pieces1.add(k);
        k = new King(4, 9, color2);
        board.addPiece(k);
        pieces2.add(k);

        p1.addPieces(pieces1);
        p2.addPieces(pieces2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void showBoard() {
        /**
        * Method used to show the board in text version.
        * Used for debugging purposes
        */
        this.board.view();
    }
}
