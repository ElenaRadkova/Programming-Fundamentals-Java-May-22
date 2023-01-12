import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workField = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalSpices = 0;

        while (workField >= 100) {
            int spices = workField - 26;
            totalSpices += spices;
            days++;
            workField = workField - 10;
        }
        System.out.println(days);
        if (totalSpices >= 26) {
            totalSpices = totalSpices - 26;
        }
        System.out.println(totalSpices);

    }
}
