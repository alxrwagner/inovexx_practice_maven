package lesson_5;

import lesson_5.task_1.ArrayWords;
import lesson_5.task_2.PhoneBook;

public class Main {
    public static void main(String[] args) {
//        String[] strings = new String[]{"A", "B", "C", "C", "D", "E", "H", "A", "B", "F", "C", "D", "E", "A"};
//
//        ArrayWords.start(strings);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "89313728");
        phoneBook.add("Ivanov", "89313745");
        phoneBook.add("Ivanov", "89313728");
        phoneBook.add("Ivanov", "89313876");
        phoneBook.add("Ivanov", "89313543");

        phoneBook.add("Petrov", "90903213");
        phoneBook.add("Petrov", "90903713");
        phoneBook.add("Petrov", "909032003");
        phoneBook.add("Petrov", "90903213");

        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
    }
}
