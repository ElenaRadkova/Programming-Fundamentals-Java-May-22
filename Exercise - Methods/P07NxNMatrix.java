import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        for (int column = 1; column <= number ; column++)
                  matrixOfNumber(number);
    }
    
    private static void matrixOfNumber (int num) {

            for (int row = 1; row <= num; row++) {
                System.out.print(num + " ");
            }
            System.out.println();

    }

}





