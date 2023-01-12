import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companyList = new LinkedHashMap<>();

        while(!input.equals("End")) {

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];


            companyList.putIfAbsent(companyName, new ArrayList<>());
            if (!companyList.get(companyName).contains(employeeId)) {
                companyList.get(companyName).add(employeeId);
            }


            input = scanner.nextLine();

        }


        companyList.entrySet().stream().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().forEach(employeeId -> System.out.println("-- "+ employeeId));
        });

    }
}
