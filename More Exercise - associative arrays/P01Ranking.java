import java.util.*;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> ranking = new HashMap<>();
        Map<String, Integer> contestPoints = new TreeMap<>();
        Map<List<String>, List<Integer>> contestNamePoints = new TreeMap<>();

        Map<String, Integer> namesPoints = new TreeMap<>();



        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String passWord = input.split(":")[1];

            if (!ranking.containsKey(contest)) {
                ranking.put(contest, passWord);
            }

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("end of submissions")) {
            String contest2 = command.split("=>")[0];
            String pass = command.split("=>")[1];
            String name = command.split("=>")[2];
            int points = Integer.parseInt(command.split("=>")[3]);

            if (ranking.containsKey(contest2) && ranking.containsValue(pass)) {
                contestPoints.put(contest2, points);
                if (!contestNamePoints.containsKey(contest2) && !contestNamePoints.containsKey(name)) {
                    contestNamePoints.put(name, new ArrayList<>());
                    contestNamePoints.entrySet();
                } else {
                    contestNamePoints.get(name).add(points);
                }

            }


//                    if (oldPoints <= points) {
//                        biggerPoints.put(contest2, points);
//                        oldPoints = points;
//                    } else {
//                        biggerPoints.put(contest2, oldPoints);
//                    }
//
//                }


                if (!namesPoints.containsKey(name)) {
                    namesPoints.put(name, points);
                } else {
                    int currentPoints2 = namesPoints.get(name);
                    int allPoints = currentPoints2 + points;
                    namesPoints.put(name, allPoints);
                }


                command = scanner.nextLine();

        }


        System.out.println();


    }
}
