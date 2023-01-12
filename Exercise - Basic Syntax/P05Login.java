import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = "";
//        1.какво се повтаря - въвеждаме парола
//           2. кога спираме - когато открием паролата
//        3. кога продължаваме - когато е грешна парола
        for (int position = user.length() - 1; position >= 0; position--) {
            char currentSymbol = user.charAt(position);
            pass += currentSymbol;
        }
        String enteredPass = scanner.nextLine();
         int countFailed = 0;
        while (!enteredPass.equals(pass)) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }
        if (enteredPass.equals(pass)) {
            System.out.printf("User %s logged in.", user);

        }

    }
}

