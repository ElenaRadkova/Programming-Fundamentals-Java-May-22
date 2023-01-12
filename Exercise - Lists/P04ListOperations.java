import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                        .split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());

        String command = scanner.nextLine();


        while(!command.equals("End")) {

            if (command.contains("Add")) {
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);
            } else if (command.contains("Insert")) {

                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                if (isValidIndex(index, numbers.size())) {
                    numbers.add(index, numToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                   if (isValidIndex(indexToRemove, numbers.size())) {
                       numbers.remove(indexToRemove);
                   } else {
                       System.out.println("Invalid index");
                   }
            } else if (command.contains("Shift left")) {
                int countLeft =Integer.parseInt(command.split(" ")[2]);

                for (int i = 1; i <= countLeft; i++) {
                    int firstNum = numbers.get(0);
                    numbers.add(firstNum);
                    numbers.remove(0);
                }
            } else if (command.contains("Shift right")) {
                int countRight =Integer.parseInt(command.split(" ")[2]);

                for (int i = 1; i <= countRight; i++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size() - 1);
                }

            }

            command = scanner.nextLine();

        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static boolean isValidIndex (int index, int sizeOfList) {
         return index >= 0 && index <= sizeOfList - 1;
    }
}
