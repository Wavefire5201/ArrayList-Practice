import java.util.*;
import java.io.*;
public class MazeSolver {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( new File("TESTMAZE2.txt"));
        ArrayList<Point> points = new ArrayList<Point>();
        int row = 0;
        Point exit = null;
        while (in.hasNext()) {
            String q = in.nextLine();
            for (int col = 0; col < q.length(); col++) {
                if (q.charAt(col) == ' ') {
                    points.add(new Point(row, col));
                } else if (q.charAt(col) == 'S') {
                    points.add(0, new Point(row, col));
                } else if (q.charAt(col) == '$') {
                    exit = new Point(row, col);
                }
            }
            row++;
        }
        points.add(exit);
        ArrayList<Point> second = new ArrayList<Point>();
        second.add(points.get(0));
        points.remove(0);
        while (points.size() > 0) {
            if (second.size() == 0) {
                System.out.println("Maze is not solvable.");
                break;
            }
            if (second.get(0).isAdjacent(points.get(points.size() - 1)) && second.size() != 0) {
                System.out.println("Maze is solved!");
                break;
            }
            
            for (int i = 0; i < points.size(); i++) {
                if (second.get(0).isAdjacent(points.get(i))) {
                    second.add(points.get(i));
                    points.remove(i);
                    if (points.size() == 0) {
                        System.out.println("Maze is solved!");
                        break;
                    }
                }
            }
            if (second.size() > 0) {
                second.remove(0);
            } else if (second.size() == 0) {
                System.out.println("Maze is not solvable.");
            }
        }
        // while (points.size() > 0) {
        //     if (second.size() == 0) {
        //         System.out.println("Maze is not solvable.");
        //         break;
        //     }
            
        //     for (int i = 0; i < points.size(); i++) {
        //         if (second.size() == 0) {
        //             System.out.println("Maze is not solvable.");
        //             break;
        //         }
        //         Point p = second.get(0);
        //         if (p.isAdjacent(exit)) {
        //             System.out.println("Maze is solved!");
        //             break;
        //         }
        //         if (p.isAdjacent(points.get(i))) {
        //             second.add(points.get(i));
        //             points.remove(i);
        //             System.out.println("removed");
        //             if (points.size() == 0) {
        //                 System.out.println("Maze is solved.");
        //                 break;
        //             }
        //         }
        //         if (second.size() > 0) {
        //             second.remove(0);
        //         }
        //     }
        // }
        // System.out.println(points.size());
        // System.out.println(second.size());
        // for (Point q:points) {
        //     System.out.println(q.toString());
        // }
        in.close();
    }
}