import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println(getVowelsCount(text));

    }

    private static int getVowelsCount(String text) {
        int count = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i') {
                count ++;

            }

        }
        return count;
        
    }
}
