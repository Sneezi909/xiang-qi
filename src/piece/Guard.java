package piece;

import game.Player.PlayerColor;

public class Guard extends Piece {

    public Guard(int x, int y, PlayerColor color) {
        super(x, y, PieceType.GUARD, color);
    }

    @Override
    public boolean validMove() {
        return false;
    }
}
