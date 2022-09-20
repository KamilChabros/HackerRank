import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator <Player> {

    @Override
    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return -1;
        }else if (a.score < b.score) {
            return 1;
        }else if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        return 0;
    }
}

class Player {
    String name;
    int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        n numnber of elements in array
        Player[] players = new Player[n];
        Checker checker = new Checker();
//        adding players and scores
        for (int i =0; i < n; i++){
            players[i] = new Player(scanner.next(), scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(players, checker);
        for (int i = 0; i < n; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }

    }
}
