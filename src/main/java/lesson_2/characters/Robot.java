package lesson_2.characters;

import lesson_2.actions.Jump;
import lesson_2.actions.Run;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Robot implements Run, Jump {
    @Getter
    private final String name;

    private final float maxRunDistance;
    private final float maxHeightJump;

    @Override
    public boolean jump(float heightJump) {
        if (heightJump <= 0){
            throw new IllegalArgumentException("Высота прыжка не может быть менее 1 метра!");
        }
        if(maxHeightJump - heightJump < 0){
            System.out.println("Робот " + name + " не смог пройти испытание прыжка на " + heightJump + " метров");
            return false;
        }
        else{
            System.out.println("Робот " + name + " преодолел испытание прыжка, прыгнув на " + heightJump + " метров");
            return true;
        }
    }

    @Override
    public boolean run(float runDistance) {
        if (runDistance <= 0){
            throw new IllegalArgumentException("Длина дорожки не может быть менее 1 метра!");
        }
        if(maxRunDistance - runDistance < 0){
            System.out.println("Робот " + name + " не смог пройти преодолеть дистанцию на " + runDistance + " метров");
            return false;
        }
        else{
            System.out.println("Робот " + name + " преодолел дистанцию, пробежав " + runDistance + " метров");
            return true;
        }
    }
}
