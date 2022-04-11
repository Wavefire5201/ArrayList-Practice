import java.util.*;
import java.io.*;
public class Palabradle2 {
    /*
    0 = games played
    1 = 1 guess wins
    2 = 2 guess wins
    3 = 3 guess wins
    4 = 4 guess wins
    5 = 5 guess wins
    6 = 6 guess wins
    7 = games lost
    8 = games won
    */
    private static ArrayList<Integer> data = new ArrayList<Integer>();
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
        
        for (int i = 0; i < 9; i++) {
            data.add(0);
        }
        // System.out.println(data.size());
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
            // if player won the game
            if (guess.equals(solution)) {
                isNotSolved = false;
                data.set(0, data.get(0) + 1);
                data.set(8, data.get(8) + 1);
                data.set(guesses, data.get(guesses) + 1);
                System.out.println("Great job, you solved the puzzle in " + guesses + " tries. Would you like to go again or check your stats? (y/n/s)");
                String decision = in.nextLine();
                if (decision.equals("y")) {
                    guesses = 1;
                    isNotSolved = true;
                    solution = a.get((int)(Math.random() * a.size()));
                    continue;
                } if (decision.equals("s")) {
                    System.out.println(String.format("Games played: %s", data.get(0)));
                    System.out.println(String.format("Games won: %s", data.get(8)));
                    System.out.println(String.format("Win percentage: %s", Math.round(((double)(data.get(8)) / data.get(0)) * 100.0)));
                    System.out.println("Guess distribution:");
                    System.out.println(String.format("1: %s %s", "*".repeat(data.get(1)), data.get(1)));
                    System.out.println(String.format("2: %s %s", "*".repeat(data.get(2)), data.get(2)));
                    System.out.println(String.format("3: %s %s", "*".repeat(data.get(3)), data.get(3)));
                    System.out.println(String.format("4: %s %s", "*".repeat(data.get(4)), data.get(4)));
                    System.out.println(String.format("5: %s %s", "*".repeat(data.get(5)), data.get(5)));
                    System.out.println(String.format("6: %s %s", "*".repeat(data.get(6)), data.get(6)));
                    System.out.println("Play again? (y/n)");
                    String decision_ = in.nextLine();
                    if (decision_.equals("y")) {
                        guesses = 1;
                        isNotSolved = true;
                        solution = a.get((int)(Math.random() * a.size()));
                        continue;
                    } else if (decision_.equals("n")) {
                        break;
                    }
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
            // if player runs out of tries
            if (guesses == 6) {
                // add games played
                data.set(0, data.get(0) + 1);
                // add games lost
                // data.set(7, data.get(7) + 1);
                System.out.println("You have run out of tries. The answer was '"+solution+"'. Would you like to go again or check your stats? (y/n/s)");
                String decision = in.nextLine();
                if (decision.equals("y")) {
                    guesses = 1;
                    isNotSolved = true;
                    solution = a.get((int)(Math.random() * a.size()));
                    continue;
                } if (decision.equals("s")) {
                    System.out.println(String.format("Games played: %s", data.get(0)));
                    System.out.println(String.format("Games won: %s", data.get(8)));
                    System.out.println(String.format("Win percentage: %s", Math.round(((double)(data.get(8)) / data.get(0)) * 100.0)));
                    System.out.println("Guess distribution:");
                    System.out.println(String.format("1: %s %s", "*".repeat(data.get(1)), data.get(1)));
                    System.out.println(String.format("2: %s %s", "*".repeat(data.get(2)), data.get(2)));
                    System.out.println(String.format("3: %s %s", "*".repeat(data.get(3)), data.get(3)));
                    System.out.println(String.format("4: %s %s", "*".repeat(data.get(4)), data.get(4)));
                    System.out.println(String.format("5: %s %s", "*".repeat(data.get(5)), data.get(5)));
                    System.out.println(String.format("6: %s %s", "*".repeat(data.get(6)), data.get(6)));
                    System.out.println("Play again? (y/n)");
                    String decision_ = in.nextLine();
                    if (decision_.equals("y")) {
                        guesses = 1;
                        isNotSolved = true;
                        solution = a.get((int)(Math.random() * a.size()));
                        continue;
                    } else if (decision_.equals("n")) {
                        break;
                    }
                } else if (decision.equals("n")) {
                    break;
                }
            }
            System.out.println(output);
            System.out.println(solution);
            guesses++;

        }
        in.close();
    }
}
