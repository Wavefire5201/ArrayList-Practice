public class PointTester {
    public static void print(String z) {
        System.out.println(z);
    }
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        System.out.println(a.isAdjacent(b));
        print(a.toString());
        print(b.toString());
    }    
}