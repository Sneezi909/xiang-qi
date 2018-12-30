package piece;

import game.Player.PlayerColor;

public class Pawn extends Piece {
    private boolean crossed;

    public Pawn(int x, int y, PlayerColor color) {
        super(x, y, PieceType.PAWN, color);
    }

    @Override
    public boolean validMove(){
        return false;
    }
}
