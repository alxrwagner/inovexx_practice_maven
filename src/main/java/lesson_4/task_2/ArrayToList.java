package lesson_4.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList <T>{

    public static <T> List<T> convert(T[] array){
        return Arrays.stream(array).collect(Collectors.toCollection(ArrayList::new));
    }
}
