import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleSymbol(text);
    }

    private static void printMiddleSymbol(String text) {
//        нечетна
        if (text.length() % 2 != 0) {
            int middleIndex = text.length() / 2;
            System.out.println(text.charAt(middleIndex));
//            четна
        } else {
            int firstMiddleIndex = text.length() / 2 - 1;
            int secondMiddleIndex = text.length() / 2;

            System.out.println(text.charAt(firstMiddleIndex) + "" + text.charAt(secondMiddleIndex));
        }


    }
}
