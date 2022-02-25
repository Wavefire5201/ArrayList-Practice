import java.util.*;
public class CountingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many players? >>> ");
        int playerCount = Integer.valueOf(in.nextLine());
        System.out.print("What's the cycle count? >>> ");
        int number = Integer.valueOf(in.nextLine());

        boolean[] players = new boolean[playerCount];
        Arrays.fill(players, true);

        int count = 0;
        int spot = 0;
        int alive = playerCount;
        while (alive != 1) {
            if (players[spot]) {
                count++;
                if (count == number) {
                    count = 0;
                    players[spot] = false;
                    alive--;
                }
            }
            spot++;
            if (spot == playerCount) {
                spot = 0;
            }
        }


        // System.out.println(Arrays.toString(players));
        for (int p = 0; p < players.length; p++) {
            if (players[p] == true) {
                System.out.print("The winner is: ");
                System.out.print(p + 1);
            }
        }
        in.close();
    }
}
