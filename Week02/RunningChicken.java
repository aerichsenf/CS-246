package prove02;

import java.awt.*;
import java.util.Random;

/**
 * Created by akuma on 1/14/17.
 */
// This create runs for her life
public class RunningChicken extends Creature implements Movable, Aware{

    int a;
    Random _rand;



    public RunningChicken() {
        _rand = new Random();
        _health = 1;
        a = _rand.nextInt(4);

    }

    public void move() {

        switch (a) {
            case 0:
                _location.y++;
                break;
            case 1:
                _location.y--;
                break;
            case 2:
                _location.x++;
                break;
            case 3:
                _location.x--;
                break;
            default:
                break;
        }
    }
    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        if (above instanceof Animal)
            a = 0;

        else if (below instanceof Animal)
            a = 1;

        else if (left instanceof Animal)
            a = 2;

        else if (right instanceof Animal)
            a = 3;
    }


    Shape getShape() {
        return Shape.Circle;
    }


    Color getColor() { return new Color(255, 252, 19); }


    Boolean isAlive() { return true; }
}
