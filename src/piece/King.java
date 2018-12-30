package piece;

import game.Player.PlayerColor;

public class King extends Piece{

    public King(int x, int y, PlayerColor color) {
        super(x, y, PieceType.KING, color);
    }

    @Override
    public boolean validMove() {
        return false;
    }
}
