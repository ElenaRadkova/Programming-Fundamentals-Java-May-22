import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> schoolDiary = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble (scanner.nextLine());
            if (!schoolDiary.containsKey(name)) {
                schoolDiary.put(name, grade);
            } else {
                schoolDiary.put(name, (schoolDiary.get(name) + grade) / 2);
            }
        }

//        schoolDiary.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
        for (Map.Entry<String, Double> entry : schoolDiary.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }

        }


    }
}
