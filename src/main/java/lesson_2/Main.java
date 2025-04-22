package lesson_2;

import lesson_2.actions.ActionObject;
import lesson_2.characters.Cat;
import lesson_2.characters.Person;
import lesson_2.characters.Robot;
import lesson_2.obstacles.Obstacle;
import lesson_2.obstacles.Treadmill;
import lesson_2.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Василий", 100, 1.5f);
        Person person2 = new Person("Максим", 300, 1f);
        Person person3 = new Person("Наталья", 50, 2f);

        Cat cat1 = new Cat("Барсик", 250, 2.5f);
        Cat cat2 = new Cat("Бастет", 120, 3f);
        Cat cat3 = new Cat("Рик", 400, 2f);

        Robot robot1 = new Robot("Бендер", 450f, 3f);
        Robot robot2 = new Robot("Клешни", 800, 4f);
        Robot robot3 = new Robot("Августо", 250, 100f);

        Wall wall1 = new Wall(1.5f);
        Wall wall2 = new Wall(5f);
        Wall wall3 = new Wall(2f);

        Treadmill treadmill1 = new Treadmill(100f);
        Treadmill treadmill2 = new Treadmill(200);
        Treadmill treadmill3 = new Treadmill(600);

        Obstacle[] obstacles = {wall1, treadmill1, wall2, treadmill2, wall3, treadmill3};
        ActionObject[] actionObjects = {person1, person2, person3, cat1, cat2, cat3, robot1, robot2, robot3};

        for (ActionObject actionObject : actionObjects) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcoming(actionObject)){
                    break;
                }
            }
        }
    }
}
