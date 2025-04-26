package lesson_1.animals;

import lombok.Getter;

public class PetCat extends Animal{
    @Getter
    static int counter;

    public PetCat(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 0;
        maxRunning = 200;
        counter++;
    }

}