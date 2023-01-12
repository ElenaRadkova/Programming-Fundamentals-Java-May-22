import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String maxModelKeg = "";

        double max = Double.MIN_VALUE;

        for (int i = 1; i <= n ; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble (scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volumeKeg = Math.PI * Math.pow(radius, 2) * height;
            if (volumeKeg > max) {
                max = volumeKeg;
                maxModelKeg = modelKeg;
            }

        }

        System.out.println(maxModelKeg);
    }
}
