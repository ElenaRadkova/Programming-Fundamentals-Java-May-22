import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String command = input.split(" ")[0];


            if (command.equals("register")) {
                String name = input.split(" ")[1];
                String carNumber = input.split(" ")[2];
                if (!cars.containsKey(name)) {
                    cars.put(name, carNumber);
                    System.out.printf("%s registered %s successfully%n", name, carNumber);

                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", carNumber);
                }

            } else if (command.equals("unregister")) {
                String name = input.split(" ")[1];

                if (!cars.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                  cars.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
//              input = scanner.nextLine();
        }

           cars.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));

    }
}
