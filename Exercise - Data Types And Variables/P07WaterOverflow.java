import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int allLiters = 0;

        for (int current = 1; current <= n; current++) {
            int liters = Integer.parseInt(scanner.nextLine());
            allLiters += liters;

            if (allLiters > 255) {
                System.out.println("Insufficient capacity!");
                allLiters = allLiters - liters;
            }
        }
        System.out.println(allLiters);
    }
}



