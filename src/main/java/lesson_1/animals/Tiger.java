package lesson_1.animals;

public class Tiger extends Animal{
    static int counter;

    public Tiger(String name) {
        super(name);
        type = this.getClass().getName();
        maxSwimming = 15;
        maxRunning = 600;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}