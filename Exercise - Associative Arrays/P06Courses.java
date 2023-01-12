
import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

//            if (!courses.containsKey(courseName)) {
//                courses.put(courseName, studentName);
//            }

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);

            input = scanner.nextLine();

        }


        courses.entrySet().stream().forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- "+ studentName));
                });

    }
}
