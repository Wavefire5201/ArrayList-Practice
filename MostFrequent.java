/* Write a program that will go through a list to see which value occurs the most.  If 
several values occur the same amount, return the first value found. */
import java.util.*;
public class MostFrequent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Enter a list of numbers (with space) >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            numbers.add(Integer.valueOf(in.next()));
        }

        int most = numbers.get(0);
        int mostCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (j == i) {continue;}
                if (numbers.get(j) == numbers.get(i)) {
                    count++;
                }
            }

            if (count > mostCount) {
                most = numbers.get(i);
                mostCount = count;
            } else if (count == mostCount && mostCount > 1) {
                continue;
            }
        }

        System.out.println(most);
    }
}