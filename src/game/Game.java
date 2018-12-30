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

        // Add cars

        // Add horses

        // Add elephants

        // Add guards

        // Add kings

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
}
