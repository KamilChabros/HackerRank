import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import jakarta.xml.bind.DatatypeConverter;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        //        MessageDigest provides functionality of a message digest algorythm (SHA-1, SHA-256, MD5)
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());

        byte[] digest = md.digest();
        //        digest() method is called to calculate message digest
        //        of an input, digest() return array of byte
        String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

        System.out.println(myHash);

    }
}
