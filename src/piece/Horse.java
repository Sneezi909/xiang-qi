package piece;

import game.Player.PlayerColor;

public class Horse extends Piece {

    public Horse(int x, int y, PlayerColor color) {
        super(x, y, PieceType.HORSE, color);
    }

    @Override
    public boolean validMove() {
        return false;
    }
}
