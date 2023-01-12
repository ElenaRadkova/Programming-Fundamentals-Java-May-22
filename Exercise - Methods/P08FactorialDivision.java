import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long fact1 = factorialCalculate(num1);
        long fact2 = factorialCalculate(num2);
        double result = fact1 / (fact2 * 1.0);
        System.out.printf("%.2f", result);
    }

    private static long factorialCalculate (int number) {
        long fact = 1;

        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;

    }
}
