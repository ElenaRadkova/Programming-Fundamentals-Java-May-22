import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double value = 0;
        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;

        for (int snowball = 1; snowball <= number ; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

               value = Math.pow((snowballSnow * 1.0 / snowballTime) , quality);

               if (value > maxValue) {
                   maxValue = value;
                   maxSnow = snowballSnow;
                   maxTime = snowballTime;
                   maxQuality = quality;

               }

        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);

    }
}
