import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());


        for (int i = 0; i < input.length() - 1; i++) {
                char currentSymbol = input.charAt(i);
                char nextSymbol = input.charAt(i + 1);
                    if (currentSymbol == nextSymbol) {
                       input.deleteCharAt(i);
                       i--;
                    }
                }


        System.out.println(input);

    }
}
