import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //In Java 7,8 the rupee symbol is not exist, there is Rs.
        Scanner scanner = new Scanner(System.in);
        BigDecimal payment = scanner.nextBigDecimal();
//        double payment = scanner.nextDouble();
        scanner.close();

//        US
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
//        CHINA
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
//        FRANCE
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);
//        INDIA
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = nf.format(payment);

        System.out.println("US: " + us);
        // To print Rs symbol instead ₹, change to Java 7
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
