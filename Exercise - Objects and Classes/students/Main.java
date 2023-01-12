package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String ownDetails = scanner.nextLine();
            String name = ownDetails.split(" ")[0];
            String lastName = ownDetails.split(" ")[1];
            double grade = Double.parseDouble(ownDetails.split(" ")[2]);

            Students students = new Students(name, lastName, grade);
            studentList.add(students);
        }

        studentList.sort(Comparator.comparingDouble(Students :: getGrade).reversed());
        for (Students student : studentList) {
            System.out.println(student.toString());
        }


    }
}
