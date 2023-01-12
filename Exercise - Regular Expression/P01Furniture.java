import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\>>(?<name>[A-Za-z]+)<<(?<price>\\d+.*\\d+)!(?<count>\\d+)");


        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
              if (matcher.find()) {
                  String furnitureName = matcher.group("name");
                  double singlePrice = Double.parseDouble(matcher.group("price"));
                  int quantity = Integer.parseInt(matcher.group("count"));

                  furniture.add(furnitureName);
                  double currentSum = singlePrice * quantity;
                  totalSum += currentSum;
              }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
       furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
