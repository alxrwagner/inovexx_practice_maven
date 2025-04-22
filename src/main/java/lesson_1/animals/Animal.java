package lesson_1.animals;


public abstract class Animal {
    protected String type;
    protected String name;
    protected int maxSwimming;
    protected int maxRunning;

    static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public void run(int distance){
        if(distance < 0){
            throw new IllegalArgumentException("Дистанция не может быть отрицательной!");
        }
        if (distance > maxRunning){
            System.out.println(type + " " + name + " пробежал " + maxRunning + " meters");
        }else {
            System.out.println(type + " " + name + " пробежал " + distance + " meters");
        }
    }

    public static int getCounter() {
        return counter;
    }
}

