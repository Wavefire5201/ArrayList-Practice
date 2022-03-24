import java.util.*;
import java.io.*;
public class MazeSolver {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( new File("TESTMAZE.txt"));

        ArrayList<Point> points = new ArrayList<Point>();
        int row = 0;
        Point exit = null;
        while (in.hasNext()) {
            String q = in.nextLine();
            System.out.println(q);
            for (int col = 0; col < q.length(); col++) {
                if (String.valueOf(q.charAt(col)) == " ") {
                    points.add(new Point(row, col));
                } else if (String.valueOf(q.charAt(col)) == "S") {
                    points.add(0, new Point(row, col));
                } else if (String.valueOf(q.charAt(col)) == "$") {
                    exit = new Point(row, col);
                }
            }
            row++;
        }
        points.add(exit);
        System.out.println(points.size());

        ArrayList<Point> second = new ArrayList<Point>();
        // for (Point q:points) {
        //     System.out.println(q.toString());
        // }
        in.close();
    }
}