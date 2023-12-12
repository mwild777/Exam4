import java.util.ArrayList;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numPlayers = sc.nextInt();
        System.out.println("Enter the number of sides for the die being used: \n");
        int dieSides = sc.nextInt();
        ArrayList<Player> players = new ArrayList<Player>();
        for(int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter the name for player " + i + ":");
            String name = sc.next();
            int roll = Die.roll(dieSides);
            players.add(new Player(name, roll));
        }
        for (Player Player : players) {
            String name = Player.getName();
            System.out.println("Player " + Player.getName() + " rolled a " + Player.getDie() +
                    " on a " + dieSides + " sided die.");
        }
        getWinner(players);

    }
    public static void getWinner(ArrayList<Player> players) {
        int max = 0;
        int winner2 = 0;
        boolean tf = false;
        int maximum = players.get(0).getDie();
        for (int i = 1; i < players.size(); i++) {
            if (maximum < players.get(i).getDie()) {
                maximum = players.get(i).getDie();
                max = i;
            }
        }
        for (int i = 0; i < players.size(); i++) {
            if (maximum == players.get(i).getDie() && max != i) {
                winner2 = i;
                tf = true;
            }
        }
        if (tf == true) {
            System.out.println(players.get(max).getName() + " and " + players.get(winner2).getName() + " tied the game.");
        }
        else {
            System.out.println(players.get(max).getName() + " won the game!");
        }
    }
}
