
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        while (firstPlayer.size() != 0 && secondPlayer.size() != 0) {
            int currentCardFirstPlayer = firstPlayer.get(0);
            int currentCardSecondPlayer = secondPlayer.get(0);
           firstPlayer.remove(0);
           secondPlayer.remove(0);

                if (currentCardFirstPlayer > currentCardSecondPlayer) {
                    firstPlayer.add(currentCardFirstPlayer);
                    firstPlayer.add(currentCardSecondPlayer);

                } else if (currentCardSecondPlayer > currentCardFirstPlayer) {
                    secondPlayer.add(currentCardSecondPlayer);
                    secondPlayer.add(currentCardFirstPlayer);

                }
            }

        if (firstPlayer.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayer));
        } else if (secondPlayer.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayer));
        }
    }
    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}

