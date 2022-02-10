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

    public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
    {
        ArrayList<Integer> array = nums;

        for (int i = 0; i < nums.size(); i++) {
            int counter = 0;
            for (int j = 2; j < nums.get(i); j++) {
                if (nums.get(i) % i == 0) {
                    counter++;
                }
                
            }
            if (counter > 2) {
                array.remove(nums.get(i));
            }
        }

        System.out.println(array);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer >>> ");
        int userInput = in.nextInt();

        ArrayList<Integer> factorList = getListOfFactors(userInput); 
        System.out.println(factorList);
        keepOnlyCompositeNumbers(factorList);
        in.close();
    }
}
