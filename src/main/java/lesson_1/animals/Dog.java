package lesson_1.animals;

import lombok.Getter;

public class Dog extends Animal{
    @Getter
    static int counter;

    public Dog(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 10;
        maxRunning = 500;
        counter++;
    }

}
