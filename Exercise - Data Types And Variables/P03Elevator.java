import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int fullPeople = Integer.parseInt(scanner.nextLine());
      int personByCourse = Integer.parseInt(scanner.nextLine());

      int fullCourse = fullPeople / personByCourse;
      int leftPeople = fullPeople - (fullCourse * personByCourse);
      int partialCourse = 0;

      if (leftPeople < personByCourse && leftPeople != 0) {
           partialCourse = 1;
          int totalCourse = fullCourse + partialCourse;
          System.out.println(totalCourse);
      } else {
          System.out.println(fullCourse);
      }

    }
}
