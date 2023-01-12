
import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

        String first = input.split(" ")[0];
        String second = input.split(" ")[1];

        int minSize = Math.min(first.length(), second.length());
        long result = 0;

        for (int i = 0; i < minSize; i++) {
            char firstSymbol = first.charAt(i);
            char secondSymbol = second.charAt(i);
            int sum = firstSymbol * secondSymbol;
            result += sum;
        }
        if (first.length() > second.length()) {
            for (int i = minSize; i < first.length(); i++) {
                char current = first.charAt(i);
                result += current;
            }
        } else {
            for (int i = minSize; i < second.length(); i++) {
                char current = second.charAt(i);
                result += current;

            }
        }

        System.out.println(result);
    }
}
