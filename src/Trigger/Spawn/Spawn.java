package Trigger.Spawn;

import Main.GameMap;

import java.util.Set;

public class Spawn extends SpawnTriggers{
    private final double delay;
    public Spawn(Set<Integer> set, int Spawn, GameMap gameMap, double del, boolean multiTrigger) {
        super(set, Spawn, gameMap, multiTrigger);
        delay = del;
    }

    @Override
    public void run() {
        try {
            sleep((long) delay*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(stop)return;
        up.run(SpawnGroup);
    }
}
