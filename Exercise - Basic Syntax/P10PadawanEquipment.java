import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double sabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBeltCount = 0;
        double totalSum = 0;


        for (int i = 0; i <= studentCount; i+=6) {

            if (i % 6 == 0 && i != 0) {
                freeBeltCount++;
            }
        }
        totalSum = sabresPrice * (studentCount + (Math.ceil(studentCount * 0.1)))
                + (robesPrice * studentCount) + (beltPrice * (studentCount - freeBeltCount));


        if (amount >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - amount));
        }

    }
}




