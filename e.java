import java.util.*;
public class e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many players? >>> ");
        int playerCount1 = Integer.valueOf(in.nextLine());
        System.out.print("What's the cycle count? >>> ");
        int cycle = Integer.valueOf(in.nextLine());
 
        boolean[] players = new boolean[playerCount1];
        Arrays.fill(players, true);
 
        int count = 0;
        int j = 0;
        int playerCount = playerCount1;
        while (playerCount != 1) {
            count++;
            if (players[j] == false) {
                count--;
            }
            if (count == cycle) {
                count = 0;
                players[j] = false;
                playerCount--;
            }
            j++;
            if (j == playerCount1) {
                j = 0;
            }
        }
        for (int p = 0; p < players.length; p++) {
            if (players[p] == true) {
                System.out.println(p+1);
            }
        }
        // System.out.println(Arrays.toString(players));
        in.close();
    }
}
