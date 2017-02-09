package prove02;

import java.awt.*;
import java.util.Random;

/**
 * Created by akuma on 1/13/17.
 */
public class Zombie extends Creature implements Movable, Aggressor {

    Random _rand;

    public Zombie() {
        _rand = new Random();
        _health = 1;
    }


    public void move() {
        // Choose a random direction each time move() is called.
        switch(_rand.nextInt(3)) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.y++;
                break;
            case 2:
                _location.y--;
                break;
            default:
                break;
        }

        }

        public void attack(Creature target) {

            if((target instanceof Animal)) {
                target.takeDamage(10);
                //_health++; Zombies don't gain life.
            }
        }


    Shape getShape() {return Shape.Square;
    }

    public Color getColor() {
        return new Color(21, 19, 132);
    }


    Boolean isAlive() { return _health > 0; }
}


