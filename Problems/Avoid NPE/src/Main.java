import java.util.Locale;
import java.util.Scanner;

class FixingNullPointerException {

    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            string = "null".equals(string) ? null : string;
            /* Do not change code above */

            assert string != null;
            System.out.println(string.toLowerCase(Locale.ENGLISH));
        } catch (NullPointerException e) {
            System.out.println("NPE!");
        }
    }
}