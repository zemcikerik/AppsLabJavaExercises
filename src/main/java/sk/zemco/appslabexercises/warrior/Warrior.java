package sk.zemco.appslabexercises.warrior;

import java.util.ArrayList;
import java.util.List;

public class Warrior {

   private String name;
   private int life;
   private int speed;
   private int muscle;
   private List<Item> items;

   public Warrior() {
       this.items = new ArrayList<>();
   }

    public Warrior(String name, int life, int speed, int muscle, List<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public void setMuscle(int muscle) {
        this.muscle = muscle;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
