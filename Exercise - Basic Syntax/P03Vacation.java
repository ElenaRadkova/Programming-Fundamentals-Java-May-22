import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

         double price = 0.00;
         double sumOFGroup = 0.00;


        switch (dayOfWeek) {
            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    price = 8.45;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 30) {
                        sumOFGroup = sumOFGroup * 0.85;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 10.90;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 100) {
                        sumOFGroup = (groupCount - 10) * price;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 15.00;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 10 && groupCount <= 20) {
                        sumOFGroup = sumOFGroup * 0.95;
                    }
                }
                break;

            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    price = 9.80;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 30) {
                        sumOFGroup = sumOFGroup * 0.85;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 15.60;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 100) {
                        sumOFGroup = (groupCount - 10) * price;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 20.00;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 10 && groupCount <= 20) {
                        sumOFGroup = sumOFGroup * 0.95;
                    }
                }
                break;

            case "Sunday":

                if (typeOfGroup.equals("Students")) {
                    price = 10.46;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 30) {
                        sumOFGroup = sumOFGroup * 0.85;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 16.00;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 100) {
                        sumOFGroup = (groupCount - 10) * price;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 22.50;
                    sumOFGroup = price * groupCount;
                    if (groupCount >= 10 && groupCount <= 20) {
                        sumOFGroup = sumOFGroup * 0.95;
                    }
                }
                break;

        }

        System.out.printf("Total price: %.2f", sumOFGroup);

    }
}
