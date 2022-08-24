import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    static Calendar calendar = Calendar.getInstance();
    static String [] DAYS = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    public static String findDay(int day, int month, int year) {
        calendar.set(year,month-1, day);
        return DAYS[calendar.get(Calendar.DAY_OF_WEEK)-1];

    }

//    public static String findDay(int day, int month, int year) {
//        final Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month-1, day);
//
//        final SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
//        return sdf.format(calendar.getTime()).toUpperCase();
//    }

//    // watch for int order as you enter input
//    public static String findDay(int day, int month, int year) {
//        LocalDate localDate = LocalDate.of(year, month, day);
//
//        return localDate.getDayOfWeek().toString();
//    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("DayOfWeekFromDate/src/main/resources/input"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        FileWriter is meant for writing streams of characters.
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        Java regex pattern \\s+ is used to match multiple whitespace characters
//        The subexpression/metacharacter “$” matches the end of a line
        String[] firstMultipleInput = bufferedReader.readLine()
                .replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Main.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
