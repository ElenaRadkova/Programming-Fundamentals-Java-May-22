import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String typeCommand = commands[0];

            switch (typeCommand) {
                case "exchange":
                    int exIndex = Integer.parseInt(commands[1]);
                    if (isIndexValid(exIndex, numbArr.length)) {
                        exchange(numbArr, exIndex);
                        System.out.println();
                    }

                    break;

                case "max":
                    String part1 = commands[1];
                    if (part1.equals("even")) {


                    } else if (part1.equals("odd")) {

                    }

                    break;

                case "min":
                    String part2 = commands[1];
                    if (part2.equals("even")) {


                    } else if (part2.equals("odd")) {

                    }

                    break;

                case "first":
                    int count = Integer.parseInt(commands[1]);
                    String part3 = commands[2];

                    if (part3.equals("even")) {

                    } else if (part3.equals("odd")) {

                    }

                    break;

                case "last":
                    int countLast = Integer.parseInt(commands[1]);
                    String partLast = commands[2];

                    if (partLast.equals("even")) {


                    } else if  (partLast.equals("odd")) {
                    }


                    break;

            }


            input = scanner.nextLine();


        }
    }

    


    //методи:

    private static boolean isValidCount(int count, int length) {
        return count <= length;
    }
    private  static  boolean isIndexValid (int index,int length) {
        return index >= 0 && index <= length;
    }

    private static int[] exchange(int[] numbArr,int exIndex) {
        int[] numbersBefore = new int[exIndex + 1];
        int[] numbersAfter = new int[numbArr.length - exIndex - 1];

        for (int index = 0; index <= exIndex; index++) {
             int currentElement = numbArr[index];
             numbersBefore[index] = currentElement;
        }
        for (int index = exIndex + 1; index < numbersAfter.length; index++) {
            int currentElement = numbArr[index];
            numbersAfter[index - exIndex - 1] = currentElement;
        }

        int[] exchangedArray = new int[numbArr.length];
        for (int index = 0; index < numbersAfter.length - 1; index++) {
             exchangedArray[index] = numbersAfter[index];
        }
        for (int index = numbersAfter.length; index < exchangedArray.length ; index++) {
            exchangedArray[index] = numbersBefore[index - numbersAfter.length];
        }
        return exchangedArray;

    }
    
    private static void printIndexMaxEvenNumber(int[] numbArr) {
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = -1;
        for (int index = 0; index < numbArr.length; index++) {
            int currentNum = numbArr[index];
            if (currentNum % 2 == 0 && currentNum >= maxEven) {
                maxEven = currentNum;
                indexMaxEven = index;
            }
        }
        if (indexMaxEven == - 1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }
    private static void printIndexMaxOddNumber(int[] numbArr) {
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = -1;
        for (int index = 0; index < numbArr.length; index++) {
            int currentNum = numbArr[index];
            if (currentNum % 2 == 1 && currentNum >= maxOdd) {
                maxOdd = currentNum;
                indexMaxOdd = index;
            }
        }
        if (indexMaxOdd == - 1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }
    }
    private static void printIndexMinEvenNumber(int[] numbArr) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = -1;
        for (int index = 0; index < numbArr.length; index++) {
            int currentNum = numbArr[index];
            if (currentNum % 2 == 0 && currentNum <= minEven) {
                minEven = currentNum;
                indexMinEven = index;
            }
        }
        if (indexMinEven == - 1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printIndexMinOddNumber(int[] numbArr) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = -1;
        for (int index = 0; index < numbArr.length; index++) {
            int currentNum = numbArr[index];
            if (currentNum % 2 == 1 && currentNum <= minOdd) {
                minOdd = currentNum;
                indexMinOdd = index;
            }
        }
        if (indexMinOdd == - 1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }
    }

    private static void printFirstEven(int[] numbArr, int count) {
        StringBuilder output = new StringBuilder();
        output.append("[");

        for (int i = 0; i < numbArr.length; i++) {
            int currentNumber = numbArr[i];
            if (currentNumber % 2 == 0) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
            output.append(", ");
        }
        output.append("]");

        System.out.println(output.toString());
    }
    private static void printFirstOdd(int[] numbArr, int count) {
        StringBuilder output = new StringBuilder();
        output.append("[");

        for (int i = 0; i < numbArr.length; i++) {
            int currentNumber = numbArr[i];
            if (currentNumber % 2 == 1) {
                output.append(currentNumber);
                count--;
            }
            if (count == 0) {
                break;
            }
            output.append(", ");
        }
        output.append("]");
        System.out.println(output.toString());
    }
    private static void printLastEven(int[] numbArr, int count) {
        String lastEven = "";

        for (int i = numbArr.length - 1; i >= 0; i--) {
            int currentNumber = numbArr[i];
            if (currentNumber % 2 == 0) {
                lastEven += currentNumber;
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.println("[");
        for (int index = lastEven.length() - 1; index <= 0; index++) {
            if (index == 0) {
                System.out.println(lastEven.charAt(index));
            } else {
                System.out.println(lastEven.charAt(index) + ", ");
            }
        }
        System.out.println("]");

    }
    private static void printLastOdd(int[] numbArr, int count) {
        String lastOdd = "";

        for (int i = numbArr.length - 1; i >= 0; i--) {
            int currentNumber = numbArr[i];
            if (currentNumber % 2 == 1) {
                lastOdd += currentNumber;
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.println("[");
        for (int index = lastOdd.length() - 1; index <= 0; index++) {
            if (index == 0) {
                System.out.println(lastOdd.charAt(index));
            } else {
                System.out.println(lastOdd.charAt(index) + ", ");
            }
        }
        System.out.println("]");

    }

}
