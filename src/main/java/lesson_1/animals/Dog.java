package lesson_1.animals;

public class Dog extends Animal{
    static int counter;

    public Dog(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 10;
        maxRunning = 500;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
