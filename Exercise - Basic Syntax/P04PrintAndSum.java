import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2= Integer.parseInt(scanner.nextLine());

        int countSum = 0;

        for (int i = num1; i <= num2 ; i++) {
            countSum += i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d", countSum);
    }
}
