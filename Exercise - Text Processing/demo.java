import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        StringBuilder newNumber = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
           String[] symbols = text.split("");
           int current = Integer.parseInt(symbols[i]);
                newNumber.append(current);




            }





    }
}
