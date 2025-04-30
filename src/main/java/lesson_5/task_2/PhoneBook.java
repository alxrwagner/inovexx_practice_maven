package lesson_5.task_2;

import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> phoneNumbers;

    public PhoneBook() {
        this.phoneNumbers = new HashMap<>();
    }

    public void add(String surname, String number){
        if (phoneNumbers.containsKey(surname)){
            phoneNumbers.get(surname).add(number);
        }else {
            phoneNumbers.put(surname, new HashSet<>());
            phoneNumbers.get(surname).add(number);
        }
    }

    public void get(String surname){
        if (phoneNumbers.containsKey(surname)){
            System.out.println(surname + ":");
            phoneNumbers.get(surname).forEach(System.out::println);
        }else System.out.println("Фамилия не найдена");
    }
}
