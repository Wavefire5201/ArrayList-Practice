public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public String toString() {
        return String.format("Position: (%s, %s)", x, y);
    }

    public boolean isAdjacent(Point a) {
        if ((x == a.x && y-1 == a.y) || (x == a.x && y+1 == a.y) || (x-1 == a.x && y == a.y) || (x+1 == a.x && y == a.y)) {
            return true;
        }
        return false;
    }
}