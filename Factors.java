import java.util.*;
public class Factors {

    public static ArrayList<Integer> getListOfFactors( int number ) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                array.add(i);
            }
        }
        
        return array;
    }

    public static ArrayList<String> keepOnlyCompositeNumbers( ArrayList<String> nums )
    {
        ArrayList<String> array = nums;

        // for (int i = 0; i < nums.size(); i++) {
        //     int counter = 0;
        //     for (int j = 2; j < nums.get(i); j++) {
        //         if (nums.get(i) % i == 0) {
        //             counter++;
        //         }
        //     }
        //     if (counter > 2) {
        //         array.remove(nums.get(i));
        //     }
        // }
        // System.out.println(array);
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> x = new ArrayList<String>();

        System.out.print("Please enter an integer >>> ");
        int userInput = in.nextInt();
        in.nextLine();
        System.out.print("Enter a list of numbers (with space) >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            x.add(in.next());
        }

        ArrayList<Integer> factorList = getListOfFactors(userInput);
        ArrayList<String> compositeList = keepOnlyCompositeNumbers(x);
        System.out.println(String.format("The factors of %s are: %s", userInput, factorList));
        System.out.println(String.format("The composite numbers are: %s", compositeList));

    }
}
