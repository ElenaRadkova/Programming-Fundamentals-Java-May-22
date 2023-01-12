import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);
        printCharacterInRange(character1, character2);
    }

    private static void printCharacterInRange(char character1, char character2) {
        if (character1 < character2) {

            for (int i = character1 + 1; i < character2; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }


        } else {
            for (int i = character2 +1; i < character1; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }


        }
    }
}
