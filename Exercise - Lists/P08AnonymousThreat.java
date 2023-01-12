
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine()
                                        .split(" "))
                                        .collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while(!inputLine.equals("3:1")) {
           String[] array = inputLine.split(" ");
           String command = array[0];

           switch (command) {
               case "merge":

                   int start = Integer.parseInt(inputLine.split(" ")[1]);
                   int end = Integer.parseInt(inputLine.split(" ")[2]);

                   if (start < 0) {
                       start = 0;
                   }
                   if (end > strings.size() - 1) {
                       end = strings.size() - 1;
                   }
                   boolean isValidIndex = start <= strings.size() - 1 && end >= 0 && start < end;
                   if (isValidIndex) {
                       String resultMerge = "";
                       for (int index = start; index <= end ; index++) {
                           String currentIndex = strings.get(index);
                           resultMerge += currentIndex;
                       }
                       for (int index = start; index <= end ; index++) {
                           strings.remove(start);
                       }
                       strings.add(start, resultMerge);
                   }
                   break;



               case "divide":
                   int index = Integer.parseInt(inputLine.split(" ")[1]);
                   int parts = Integer.parseInt(inputLine.split(" ")[2]);
                   String divideElement = strings.get(index);
                   strings.remove(index);

                   int partSize = divideElement.length() / parts;
                   int beginIndex = 0;
                   for (int part = 1; part < parts ; part++) {
                       strings.add(index, divideElement.substring(beginIndex, beginIndex + partSize));
                       index++;
                       beginIndex += partSize;
                   }
                   strings.add(index, divideElement.substring(beginIndex));

                   break;
           }

            inputLine = scanner.nextLine();
        }
//        for (String item : strings) {
//            System.out.print(item + " ");
//        }
        System.out.println(String.join(" ", strings));
    }
}
