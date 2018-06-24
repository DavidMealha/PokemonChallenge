package app;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveNorth() {
        this.y++;
    }

    public void moveSouth() {
        this.y--;
    }

    public void moveEast() {
        this.x++;
    }

    public void moveWest() {
        this.x--;
    }

    public String getKey() {
        return this.x + "_" + this.y;
    }
}
