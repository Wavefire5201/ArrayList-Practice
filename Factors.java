import java.util.*;
public class Factors {

    public static ArrayList<Integer> getListOfFactors( int number ) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 2; i < number; i++ ) {
            
        }


        return array;
    }
    public static ArrayList<Integer> keepOnlyCompositeNumbers( ArrayList<Integer> nums )
    {
        ArrayList<Integer> array = nums;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i); j++) {
                // if j
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.print("Please enter an integer >>> ");

        nums.add(in.nextInt());
        
        System.out.println(keepOnlyCompositeNumbers(nums));
        in.close();
    }
}
