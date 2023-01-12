import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();
       String [] codes = input.split("\\s+");

       double totalSum = 0;

        for (String code : codes) {
           double sum = getModifyNumber(code);
           totalSum += sum;

        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifyNumber(String code) {
        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                                               .replace(lastLetter, ' ')
                                                .trim());




        if (Character.isUpperCase(firstLetter)) {
            int positionUpperCase = (int) firstLetter - 64;
            number /= positionUpperCase;

        } else {
            int positionLowerCase = (int) firstLetter - 96;
            number *= positionLowerCase;
        }

        if (Character.isUpperCase(lastLetter)) {
            int positionUpperCase = (int) lastLetter- 64;
            number -= positionUpperCase;

        } else {
            int positionLowerCase = (int) lastLetter - 96;
            number += positionLowerCase;
        }

        return number;

    }
}
