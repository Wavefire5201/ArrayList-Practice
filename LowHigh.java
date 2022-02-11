/* 
1) Write a program that reads in a list of integers. 
(can get and create this list like we got started on the ExpressionSolver).
Find the lowest number in the list and the highest number in the list
and print out those two values and the average of those two values.
For example, given 1 2 3 4 5 6 7 8 9 10. Lowest 1, Highest 10, average 5.
*/
import java.util.*;
public class LowHigh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> x = new ArrayList<String>();
        System.out.print("Enter a list of numbers (with space) >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            x.add(in.next());
        }

        int highest = Integer.valueOf(x.get(0));
        for (int i = 0; i < x.size(); i++) {
            if (Integer.valueOf(x.get(i)) > highest) {highest = Integer.valueOf(x.get(i));}
        }

        int lowest = Integer.valueOf(x.get(0));
        for (int i = 0; i < x.size(); i++) {
            if (Integer.valueOf(x.get(i)) < lowest) {lowest = Integer.valueOf(x.get(i));}
        }

        int average = (highest + lowest) / 2;
        System.out.println("Highest number >>> " + highest);
        System.out.println("Lowest number >>> " + lowest);
        System.out.println("Average >>> " + average);

        in.close();
    }
}
