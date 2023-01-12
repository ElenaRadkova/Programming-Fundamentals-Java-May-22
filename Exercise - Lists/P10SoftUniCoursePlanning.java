import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine()
                                        .split(", "))
                                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");
            String partCommand =command[0];
            String lessonTitle = command[1];

            switch (partCommand) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (schedule.contains(lessonTitle)) {
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if (schedule.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {
                        schedule.remove(indexLesson + 1);
                    }
                    break;

                case "Swap":
                  String lessonTitle2 = command[2];

                  if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                      int index1 = schedule.indexOf(lessonTitle);
                      int index2 = schedule.indexOf(lessonTitle2);
                      schedule.set(index1, lessonTitle2);
                      schedule.set(index2, lessonTitle);

                      String exOne = lessonTitle + "-Exercise";
                      String exTwo = lessonTitle2 + "-Exercise";

                      if (schedule.contains(exOne)) {
                          schedule.remove(schedule.indexOf(exOne));
                          schedule.add(schedule.indexOf(lessonTitle + 1), exOne);
                      }
                      if (schedule.contains(exTwo)) {
                          schedule.remove(schedule.indexOf(exTwo));
                          schedule.add(schedule.indexOf(lessonTitle2) + 1, exTwo);
                      }
                  }
                    break;

                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = schedule.indexOf(lessonTitle);
                    if (schedule.contains(lessonTitle)) {
                        if (indexLessonTitle == schedule.size() - 1) {
                            schedule.add(indexLessonTitle + 1,exercise);
                        } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                            schedule.add(indexLessonTitle + 1,exercise);
                        }
                        } else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }

                    break;
            }

            input = scanner.nextLine();
        }

       printList(schedule);

    }
    private static void printList(List<String> titles) {
        int count = 1;
        for (String title : titles) {
            System.out.println(count + "." + title);
            count++;
        }
    }
}
