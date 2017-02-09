package prove02;

import java.awt.*;
import java.util.*;

/**
 * Created by akuma on 1/13/17.
 */
public class Wolf extends Creature implements Movable, Aggressor, Aware {
    Random _rand;
    int a;
    int spawnAbility;
    int babyNum;



    public Wolf() {
        _rand = new Random();
        _health = 1;
        a = _rand.nextInt(4);
        spawnAbility = 0;
        babyNum = 0;

    }

    public int numOfBabies() { return babyNum;}



    public void move() {

             switch (a) {
                case 0:
                    _location.y--;
                    break;
                case 1:
                    _location.y++;
                    break;
                case 2:
                    _location.x--;
                    break;
                case 3:
                    _location.x++;
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
        return Shape.Square;
    }

    public Color getColor() {
        return new Color(94, 94, 92);
    }


    Boolean isAlive() {
        return _health > 0; }


    public void attack(Creature target) {
        if ((target instanceof Animal)) {
            target.takeDamage(5);
            spawnAbility++;

        }

    }
    public Creature spawnNewCreature(){
        if (spawnAbility == 1){
            spawnAbility--;
            babyNum++;
        }
        return null;
    }
}


