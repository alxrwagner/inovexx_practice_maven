package lesson_1.animals;

public class PetCat extends Animal{
    static int counter;

    public PetCat(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 0;
        maxRunning = 200;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}