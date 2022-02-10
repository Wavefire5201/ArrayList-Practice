/*
2) Write a program that takes in a list of integers and calls a method that returns a boolean
- true if there are duplicate values and false if there are not.
For example, given 1 2 3 4 5 6 7 8 9 10 print false, given 1 2 2 2 5 print true.
*/
// Enoch Zhu 10th 2/10/22
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> x = new ArrayList<String>();
        System.out.print("Enter a list of numbers (with space) >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            x.add(in.next());
        }

        boolean dupe = false;
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.size(); j++) {
                if (j == i) {continue;}
                if (x.get(i).equals(x.get(j))) {dupe = true;}
            }
        }

        System.out.println("Duplicate >>> " + dupe);
        in.close();
    }
}
