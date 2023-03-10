
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                                        .split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());

        int sumRemovedElement = 0;


        while(distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = distance.get(0);
                sumRemovedElement += firstElement;
                int lastElement = distance.get(distance.size() - 1);
                distance.set(0, lastElement);
                modifyList(distance, firstElement);

            } else if (index > distance.size() - 1) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                sumRemovedElement += lastElement;
                distance.set(distance.size() - 1, firstElement);
                modifyList(distance, lastElement);

            } else if (index >= 0 && index <= distance.size() - 1) {
                int removedElement = distance.get(index);
                sumRemovedElement += removedElement;
                distance.remove(index);
                modifyList(distance, removedElement);

            }
        }
        System.out.println(sumRemovedElement);

    }

    public static void modifyList (List<Integer> list, int removedElement) {
        for (int index = 0; index <= list.size() - 1 ; index++) {
            int currentElement = list.get(index);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            list.set(index, currentElement);
        }
    }

}
