package Main;

import Triggers.Pickup;
import Triggers.Spawn.Instant_Count;
import Triggers.Spawn.Spawn;
import Triggers.Stop;
import Triggers.Trigger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        LinkedList<Trigger> init = new LinkedList<Trigger>();
        init.add(new Spawn(new HashSet<>(), 1, gameMap, 0, false));
        init.add(new Pickup(new HashSet<>(), gameMap, false, 10, 1));
        LinkedList<Trigger> Triggers = new LinkedList<>();
        HashSet<Integer> temp = new HashSet<>();
        temp.add(1);
        temp.add(2);
        Triggers.add(new Spawn((Set<Integer>) temp.clone(), 3, gameMap, 0.03, true));
        temp = new HashSet<>();
        temp.add(3);
        Triggers.add(new Spawn((Set<Integer>) temp.clone(), 2, gameMap, 0.03, true));
        Triggers.add(new Instant_Count((Set<Integer>) temp.clone(), 4, gameMap, true, 0, 1, Instant_Count.BIGGER));
        Triggers.add(new Instant_Count((Set<Integer>) temp.clone(), 5, gameMap, false, 0, 1, Instant_Count.EQUAL));
        Triggers.add(new Instant_Count((Set<Integer>) temp.clone(), 6, gameMap, true, 0, 1, Instant_Count.SMALLER));

        temp = new HashSet<>();
        temp.add(4);

        Triggers.add(new Pickup((Set<Integer>) temp.clone(), gameMap, true, 1, 1));
        Triggers.add(new Pickup((Set<Integer>) temp.clone(), gameMap, true, -1, 2));

        temp = new HashSet<>();
        temp.add(5);
        Triggers.add(new Stop((Set<Integer>) temp.clone(), gameMap, true, 2));
        Triggers.add(new Stop((Set<Integer>) temp.clone(), gameMap, true, 3));

        temp = new HashSet<>();
        temp.add(6);

        Triggers.add(new Pickup((Set<Integer>) temp.clone(), gameMap, true, -1, 1));
        Triggers.add(new Pickup((Set<Integer>) temp.clone(), gameMap, true, 1, 2));

        gameMap.setInit(init);

        gameMap.start();


        for (int i = 0; i < 2; i++) {
            System.out.println("Count ["+i+"]: "+gameMap.count[i]);
        }
    }
}
