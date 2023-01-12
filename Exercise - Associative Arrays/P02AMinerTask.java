import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> product = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!product.containsKey(resource)) {
                product.put(resource, quantity);
            } else {
                product.put(resource, product.get(resource) + quantity);
            }
            resource = scanner.nextLine();

        }

         product.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }
}
