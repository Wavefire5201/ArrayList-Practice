import java.util.*;
public class ExpressionSolver {

    public static double advanced(ArrayList<String> equation) {
        while (equation.contains("*") || equation.contains("/")) {
            int multi_ = equation.indexOf("*");
            int divi_ = equation.indexOf("/");
            if (multi_ < divi_ || (divi_ == -1)) {
                    if (multi_ == -1) {
                        break;
                    }
                // while (equation.contains("*")) {
                    int x = equation.indexOf("*");
                    double multi = Double.valueOf(equation.get(x - 1)) * Double.valueOf(equation.get(x + 1));
                    equation.set(x, String.valueOf(multi));
                    equation.remove(x + 1);
                    equation.remove(x - 1);  
               // }
            } else {
                    if (divi_ == -1) {
                        break;
                    }
                //while (equation.contains("/")) {
                    int x = equation.indexOf("/");
                    double divi = Double.valueOf(equation.get(x - 1)) / Double.valueOf(equation.get(x + 1));
                    equation.set(x, String.valueOf(divi));
                    equation.remove(x + 1);
                    equation.remove(x - 1);
                //}
            }

        }

        double sum = Double.valueOf(equation.get(0));
        for (int i = 1; i < equation.size() - 1; i += 2) {
            if (equation.get(i).equals("+")) {
                sum += Double.valueOf(equation.get(i + 1 ));
            } else {
                sum -= Double.valueOf(equation.get(i - 1));
            }   
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> equation = new ArrayList<String>();
        System.out.print("Enter an equation >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            equation.add(in.next());
        } 
        
        double sum = advanced(equation);
        System.out.println(qq + " = " + sum);
    }
}   
