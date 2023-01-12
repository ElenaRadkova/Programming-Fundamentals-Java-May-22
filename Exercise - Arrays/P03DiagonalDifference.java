import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }
        int primaryDiagonal = 0;
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if(row == col) {
//                    primaryDiagonal += matrix[row][col];
//                }
//            }
//        }

        for (int index = 0; index < size; index++) {
            primaryDiagonal += matrix[index][index];
        }

        int secondaryDiagonal = 0;

        for (int row = size - 1, col = 0; col < size && row >= 0; col++, row--) {
            secondaryDiagonal += matrix[row][size - row - 1];
        }
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
