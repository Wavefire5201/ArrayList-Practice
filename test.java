import java.util.*;
public class test {
    
    public static int addSubtract(ArrayList<String> equation) {
        int finalAnswer = 0;

        while (equation.contains("+") || equation.contains("-")) {
            int add = equation.indexOf("+"); 
            int subtract = equation.indexOf("-"); 

            if (subtract < add && subtract != -1) {
                int answer = 0;
                while (equation.contains("-")) {
                    int x = equation.indexOf("-"); 
                    answer = Integer.valueOf(equation.get(x - 1)) - Integer.valueOf(x + 1);
                    equation.set(subtract, String.valueOf(answer));
                    equation.remove(subtract + 1);
                    equation.remove(subtract - 1);
                }
                
                finalAnswer = answer;
            }
        }

        return finalAnswer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> x = new ArrayList<String>();
        System.out.print("Enter an equation >>> ");
        String qq = in.nextLine();
        in = new Scanner(qq);
        while (in.hasNext()) {
            x.add(in.next());
        }

        int answer = addSubtract(x);
        System.out.println(qq + " = " + answer);
    }
}

