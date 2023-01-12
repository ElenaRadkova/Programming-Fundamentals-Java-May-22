
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                                      .split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String [] element = input.split(" ");
            if (element[0].equals("Add")) {
                wagons.add(Integer.parseInt(element[1]));
            } else {
                int passenger = Integer.parseInt(element[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passenger <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passenger);
                        break;
                    }
                }
            }
             input = scanner.nextLine();
        }

        System.out.print(wagons.toString().replaceAll("[\\[\\],]", ""));

    }
}
