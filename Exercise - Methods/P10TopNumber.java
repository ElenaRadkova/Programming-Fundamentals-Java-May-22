import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= number; num++) {
            if (isDivideBy8(num) && isContainsOddDigit(num)) {
                System.out.println(num);

            }
        }
    }

    private static boolean isDivideBy8(int number) {
        int sumOfDigit = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumOfDigit += lastDigit;
            number = number / 10;
        }
        if (sumOfDigit % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isContainsOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                return true;
            }
            number = number / 10;
        }
        return false;

    }
}
