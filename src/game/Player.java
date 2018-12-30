package game;

public class Player {
    public enum PlayerColor {
        RED,
        BLACK
    }

    private PlayerColor color;

    public Player(PlayerColor color) {
        this.color = color;
    }

    public PlayerColor getColor() {
        return color;
    }
}
