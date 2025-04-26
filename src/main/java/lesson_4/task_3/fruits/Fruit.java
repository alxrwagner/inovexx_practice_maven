package lesson_4.task_3.fruits;

import lombok.Getter;


@Getter
public abstract class Fruit {
    public float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
}
