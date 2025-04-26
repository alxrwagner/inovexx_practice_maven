package lesson_4;

import lesson_4.task_1.SwapElementsArray;
import lesson_4.task_2.ArrayToList;
import lesson_4.task_3.Box;
import lesson_4.task_3.fruits.Apple;
import lesson_4.task_3.fruits.Fruit;
import lesson_4.task_3.fruits.Orange;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String[] strings = {"hi", "all", "hello", "world", "space"};
//
//        SwapElementsArray.swap(strings, 0, 3);
//
//        System.out.println(Arrays.toString(strings));
//
//        SwapElementsArray.swap(strings, "all", "space");
//
//        System.out.println(Arrays.toString(strings));
//
//        List<String> list = ArrayToList.convert(strings);
//
//        list.forEach(System.out::println);

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.add(new Orange(0.5f), new Orange(1f), new Orange(0.7f));
        appleBox.add(new Apple(0.5f), new Apple(0.6f), new Apple(1.1f));

        System.out.println(orangeBox.compareTo(appleBox));
    }
}
