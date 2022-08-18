
import java.util.*;

public class Main {

    private static int B;
    private static int H;
    private static int area;

    static {
        B = 0;
        H = 0;
        area = 0;
    }
    public static void main(String[] args) {

//        System.out.println("Please enter two numbers one after another, accepting by pressing enter");
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        area = B * H;

        if ((B > 0) && (H > 0)){
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
