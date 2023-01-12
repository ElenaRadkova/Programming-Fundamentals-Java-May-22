import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> articlePrice = new LinkedHashMap<>();
        Map<String, Integer> articleQuantity = new LinkedHashMap<>();

        while(!input.equals("buy")) {
            String article = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            articlePrice.put(article, price);

            if (!articleQuantity.containsKey(article)) {
                articleQuantity.put(article, quantity);
            } else {
                 articleQuantity.put(article, articleQuantity.get(article) + quantity);
            }


            input = scanner.nextLine();

        }

        for (Map.Entry<String, Double> entry : articlePrice.entrySet()) {
                  String articleName = entry.getKey();
                  double totalSum = entry.getValue() * articleQuantity.get(articleName);
            System.out.printf("%s -> %.2f%n", articleName, totalSum);
        }

    }
}
