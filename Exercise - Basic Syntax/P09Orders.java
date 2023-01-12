import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ((daysInMonth * capsulesCount) * pricePerCapsule)

        int orderCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= orderCount ; i++) {
            double capsulePrice = Double.parseDouble (scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = ((capsuleCount * days) * capsulePrice);

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            totalPrice += orderPrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
        
    }
}
