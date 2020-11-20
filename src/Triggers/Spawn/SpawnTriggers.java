package Triggers.Spawn;

import Main.GameMap;
import Triggers.Trigger;

import java.util.Set;

public abstract class SpawnTriggers extends Trigger implements Cloneable{
    protected final int SpawnGroup;
    public SpawnTriggers(Set<Integer> group, GameMap gameMap, boolean multiTrigger, int Spawn) {
        super(group, gameMap, multiTrigger);
        SpawnGroup = Spawn;
    }
    public void Spawn(){
        up.run(SpawnGroup);
    }//실행 요청

}
