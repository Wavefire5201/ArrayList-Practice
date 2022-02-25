import java.util.*;
public class CountingGameArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many players? >>> ");
        int playerCount = Integer.valueOf(in.nextLine());
        System.out.print("What's the cycle count? >>> ");
        int number = Integer.valueOf(in.nextLine());

        ArrayList<Integer> players = new ArrayList<Integer>();
        for (int i = 1; i < playerCount + 1; i++) {
            players.add(i);
        }

        // System.out.println(players);
        int count = 0;
        int index = 0;
        while (players.size() != 1) {
            count++;
            if (count == number) {
                players.remove(index);
                index--;
                count = 0;
            }
            index++;
            if (index == players.size()) {
                index = 0;
            }
        }
        System.out.println("The winner is: " + players);
        in.close();
    }
}