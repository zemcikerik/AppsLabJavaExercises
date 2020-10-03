package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sk.zemco.appslabexercises.warrior.BattleResult;
import sk.zemco.appslabexercises.warrior.Item;
import sk.zemco.appslabexercises.warrior.Warrior;

import java.util.ArrayList;
import java.util.List;

public class WarriorTests {

    @Test
    public void testFromExercise() {
        Item item1 = new Item("goldfish", 45);
        Item item2 = new Item("watch", 15);
        Item item3 = new Item("dog", 53);

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);

        List<Item> items2 = new ArrayList<>();
        items2.add(item2);
        items2.add(item3);

        Warrior warrior1 = new Warrior("warrior1", 10, 4, 7, items1);
        Warrior warrior2 = new Warrior("warrior2", 9, 5, 3, items2);
        BattleResult result = ExerciseApp.battleOfWarriors(warrior1, warrior2);

        Assertions.assertEquals(BattleResult.FIRST_WINS, result);
        Assertions.assertTrue(warrior1.getItems().contains(item1));
        Assertions.assertFalse(warrior2.getItems().contains(item1));
        Assertions.assertEquals(8, warrior2.getLife());
    }

}
