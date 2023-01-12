import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileWay = scanner.nextLine();
//        C:\Internal\training-internal\Template.pptx
        String[] foldersName = fileWay.split("\\\\");
        String fullFileName = foldersName[foldersName.length - 1];
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
