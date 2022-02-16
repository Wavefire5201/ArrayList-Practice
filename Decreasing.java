/* Write a program that will go through a list to see if the numbers are decreasing.  You 
must combine variables, ifs, and a loop to create a working method.  There will always be at least one item in 
the list.  Each prior number has to be greater than the following number for the list to be considered going 
down.*/ 
import java.util.*;
public class Decreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Enter a list of numbers (with space) >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            numbers.add(Integer.valueOf(in.next()));
        }

        boolean decreasing = true;
        int previous = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < previous) {
                previous = numbers.get(i);
            } else {
                decreasing = false;
            }
        }
        
        System.out.println(decreasing);
    }
}