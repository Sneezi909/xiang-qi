package game;

import board.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

        WIDTH = CELL_WIDTH * Board.GRID_WIDTH + 100;
        HEIGHT = CELL_WIDTH * Board.GRID_HEIGHT + 100;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(board);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
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
