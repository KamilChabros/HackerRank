import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashSet<String> uniquePairs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
//            because of two strings separated with space as input
            uniquePairs.add(scanner.next() + " " + scanner.next());
//            number of unique pairs
            System.out.println(uniquePairs.size());
        }
        scanner.close();
        System.out.println(uniquePairs);
    }
}
