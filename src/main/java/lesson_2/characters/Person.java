package lesson_2.characters;

import lesson_2.actions.Jump;
import lesson_2.actions.Run;

public class Person implements Run, Jump {
    private final String name;

    public String getName() {
        return name;
    }

    private final float maxRunDistance;
    private final float maxHeightJump;

    public Person(String name, float maxRunDistance, float maxHeightJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean jump(float heightJump) {
        if (heightJump <= 0){
            throw new IllegalArgumentException("Высота прыжка не может быть менее 1 метра!");
        }
        if(maxHeightJump - heightJump < 0){
            System.out.println("Человек " + name + " не смог пройти испытание прыжка на " + heightJump + " метров");
            return false;
        }
        else{
            System.out.println("Человек " + name + " преодолел испытание прыжка, прыгнув на " + heightJump + " метров");
            return true;
        }
    }

    @Override
    public boolean run(float runDistance) {
        if (runDistance <= 0){
            throw new IllegalArgumentException("Длина дорожки не может быть менее 1 метра!");
        }
        if(maxRunDistance - runDistance < 0){
            System.out.println("Человек " + name + " не смог пройти преодолеть дистанцию на " + runDistance + " метров");
            return false;
        }
        else{
            System.out.println("Человек " + name + " преодолел дистанцию, пробежав " + runDistance + " метров");
            return true;
        }
    }
}
