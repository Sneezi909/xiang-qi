package piece;

import game.Player.PlayerColor;

public class Car extends Piece {

    public Car(int x, int y, PlayerColor color) {
        super(x, y, PieceType.CAR, color);
    }

    @Override
    public boolean validMove() {
        return false;
    }
}
