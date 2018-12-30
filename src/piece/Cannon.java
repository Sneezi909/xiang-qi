package piece;

import game.Player.PlayerColor;

public class Cannon extends Piece{

    public Cannon(int x, int y, PlayerColor color) {
        super(x, y, PieceType.CANNON, color);
    }

    @Override
    public boolean validMove() {
        return false;
    }
}
