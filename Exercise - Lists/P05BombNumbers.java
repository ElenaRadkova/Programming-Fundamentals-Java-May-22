import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                      .split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());

        String [] array = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(array[0]);
        int power = Integer.parseInt(array[1]);

        while(numbers.contains(bomb)) {
            int indexBomb = numbers.indexOf(bomb);
            int startIndex = indexBomb - power;
            int endIndex = indexBomb + power;

            if (startIndex < 0) {
                startIndex = 0;
            }
            if (endIndex >= numbers.size()) {
                endIndex = numbers.size() - 1;
            }

            for (int i = startIndex; i <= endIndex; i++) {
                numbers.remove(startIndex);
            }
        }
          int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }
        System.out.println(sum);
    }

}
