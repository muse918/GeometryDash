package Trigger.Spawn;

import Main.GameMap;
import Trigger.Trigger;

import java.util.Set;

public abstract class SpawnTriggers extends Trigger {
    protected final int SpawnGroup;
    public SpawnTriggers(Set<Integer> set, int Spawn, GameMap gameMap, boolean multiTrigger) {
        super(set, gameMap, multiTrigger);
        SpawnGroup = Spawn;
    }
    public void Spawn(){
        up.run(SpawnGroup);
    }//실행 요청
}
