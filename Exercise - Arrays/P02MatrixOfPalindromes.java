import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSizes = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSizes[0]);
        int columns = Integer.parseInt(matrixSizes[1]);

        String[][] matrix = new String[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char outsideLetters= (char)('a' + row);
                char insideLetter= (char)('a' + row + col);
                matrix[row][col] = "" + outsideLetters + insideLetter + outsideLetters;
            }
        }


        for (String[] letters : matrix) {
            for (String letter : letters) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }

    }
}
