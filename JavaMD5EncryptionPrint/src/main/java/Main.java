import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import jakarta.xml.bind.DatatypeConverter;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
//        digest() method is called to calculate message digest
//        of an input digest() return array of byte
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();

        System.out.println(myHash);
    }
}
