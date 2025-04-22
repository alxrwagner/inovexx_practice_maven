package lesson_2.obstacles;

import lesson_2.actions.Jump;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Wall extends Obstacle{
    private final float height;

    @Override
    public boolean overcoming(Object o) {
        if (o instanceof Jump){
            return ((Jump) o).jump(height);
        }else {
            System.out.println("Это существо не умеет прыгать, поэтому не может участвовать в этом испытании!");
        }
        return true;
    }
}
