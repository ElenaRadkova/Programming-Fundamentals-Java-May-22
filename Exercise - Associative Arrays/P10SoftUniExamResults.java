import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while(!input.equals("exam finished")) {
            String userName = input.split("-")[0];

            if (!input.contains("banned")) {

                String language = input.split("-")[1];
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    int currentQuantity = submissions.get(language);
                    submissions.put(language, currentQuantity + 1);
                }

                if (!results.containsKey(userName)) {
                    int points = Integer.parseInt(input.split("-")[2]);
                    results.put(userName, points);
                } else if (results.containsKey(userName)) {
                    int points = Integer.parseInt(input.split("-")[2]);
                    int currentPoints = results.get(userName);
                    if (currentPoints > points) {
                        results.put(userName, currentPoints);
                    } else {
                        results.put(userName, points);
                    }
                }
            } else {
                results.remove(userName);
            }




            input = scanner.nextLine();

        }
        System.out.println("Results:");
        results.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        submissions.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

    }
}
