package lesson_4.task_3;

import lesson_4.task_3.fruits.Fruit;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box<T>> {

    private final List<T> fruits;
    @Getter
    private float weight;

    public Box() {
        this.fruits = new ArrayList<>();
        this.weight = 0;
    }

    private void counterWight() {
        if (fruits.isEmpty()) {
            this.weight = 0;
        } else {
            this.weight = fruits.stream().map(Fruit::getWeight).reduce(0.0f, Float::sum);
        }
    }
    public void add(Collection<T> fruits) {
        this.fruits.addAll(fruits);
        counterWight();
    }

    public void add(T... fruit) {
        this.fruits.addAll(List.of(fruit));
        counterWight();
    }

    public void pour(Box<T> box) {
        box.add(this.fruits);
        this.fruits.clear();
        counterWight();
    }

    @Override
    public int compareTo(Box box) {
        if (this.getWeight() - box.getWeight() == 0) return 0;
        if (this.getWeight() - box.getWeight() > 0) return 1;
        if (this.getWeight() - box.getWeight() < 0) return -1;

        return 0;
    }
}
