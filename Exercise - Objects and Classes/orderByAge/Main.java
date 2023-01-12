package orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String personInfo = scanner.nextLine();

        while (!personInfo.equals("End")) {
            String name = personInfo.split(" ")[0];
            String id = personInfo.split(" ")[1];
            int age = Integer.parseInt(personInfo.split(" ")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            personInfo = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());

        }

    }
}
