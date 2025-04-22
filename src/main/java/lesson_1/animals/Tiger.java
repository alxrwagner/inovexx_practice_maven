package lesson_1.animals;

import lombok.Getter;

public class Tiger extends Animal{
    @Getter
    static int counter;

    public Tiger(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 15;
        maxRunning = 600;
        counter++;
    }

}