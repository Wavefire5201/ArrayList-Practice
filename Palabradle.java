import java.util.*;
import java.io.*;
public class Palabradle {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(new File("words.txt"));
        while (in.hasNext()) {
            String q = in.nextLine();
            if (q.length() == 6) {
                words.add(q);
            }
        }
        System.out.println(words.size());
        for (int i = 0; i <= 20; i++) {
            int random_spot = (int)(Math.random() * words.size());
            System.out.println(i + " " + words.get(random_spot));
        }
        puzzle(words);
        in.close();
    }

    public static void puzzle(ArrayList<String> a) {
        Scanner in = new Scanner(System.in);
        String solution = a.get((int)(Math.random() * a.size()));
        boolean isNotSolved = true;
        int guesses = 1;
        while (isNotSolved && guesses <= 6) {
            System.out.print("Please enter guess #" + guesses + ": ");
            String guess = in.nextLine();
            System.out.println(guess);
            boolean isInWordList = false;
            for (String e:a) {
                if (guess.equals(e)) {
                    isInWordList = true;
                }
            }
            if (guess.equals(solution)) {
                isNotSolved = false;
                System.out.println("Great job, you solved the puzzle in " + guesses + " tries. Would you like to go again? (y/n)");
                String decision = in.nextLine();
                if (decision.equals("y")) {
                    guesses = 1;
                    isNotSolved = true;
                    solution = a.get((int)(Math.random() * a.size()));
                    continue;
                } else if (decision.equals("n")) {
                    break;
                }
            }
            if (!isInWordList) {
                System.out.println("The word entered is not recognized, please enter a new word!");
                continue;
            }
            String output = "";
            for (int i = 0; i < guess.length(); i++) {
                if (guess.charAt(i) == solution.charAt(i)) {
                    output = output + String.valueOf(guess.charAt(i)).toUpperCase();
                    continue;
                }
                boolean dontAddEmpty = false;
                for (int j = 0; j < guess.length(); j++) {
                    if (guess.charAt(i) == solution.charAt(j)) {
                        output = output + String.valueOf(guess.charAt(i));
                        dontAddEmpty = true;
                        break;
                    }
                    continue;
                }
                if (!dontAddEmpty) {output = output + "*";}

            }
            System.out.println(output);
            // System.out.println(solution);
            guesses++;

        }
        in.close();
    }
}
