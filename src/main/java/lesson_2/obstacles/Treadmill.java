package lesson_2.obstacles;

import lesson_2.actions.Run;

public class Treadmill extends Obstacle {
    private final float length;

    public Treadmill(float length) {
        this.length = length;
    }

    @Override
    public boolean overcoming(Object o) {
        if(o instanceof Run){
            return ((Run) o).run(length);
        }else {
            System.out.println("Это существо не умеет бегать, поэтому не может участвовать в этом испытании!");
        }
        return true;
    }
}
