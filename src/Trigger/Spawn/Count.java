package Trigger.Spawn;

import Main.GameMap;

import java.util.Set;

public class Count extends SpawnTriggers{
    private final int targetNumber;
    private final int count;
    public Count(Set<Integer> set, int Spawn, GameMap gameMap, boolean multiTrigger, int targetNumber, int count) {
        super(set, Spawn, gameMap, multiTrigger);
        this.targetNumber = targetNumber;
        this.count = count;
    }

    @Override
    public void run() {
        while (!stop){
            if(up.count[count]>=targetNumber){
                Spawn();
                return;
            }
        }
    }
}
