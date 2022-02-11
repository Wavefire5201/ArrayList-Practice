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

    public static ArrayList<Integer> keepOnlyCompositeNumbers( ArrayList<String> nums )
    {
        ArrayList<Integer> compositeNumbers = new ArrayList<Integer>();

        for (int i = 0; i < nums.size(); i++) {
            int counter = 0;
            for (int j = 1; j < Integer.valueOf(nums.get(i)); j++) {
                if (Integer.valueOf(nums.get(i)) % j == 0) {
                    counter++;
                }
            }
            if (counter > 2) {
                compositeNumbers.add(Integer.valueOf(nums.get(i)));
            }
        }
        compositeNumbers.sort(null);
        return compositeNumbers;
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
        ArrayList<Integer> compositeList = keepOnlyCompositeNumbers(x);
        System.out.println(String.format("The factors of %s are: %s", userInput, factorList));
        System.out.println(String.format("The composite numbers are: %s", compositeList));

    }
}
