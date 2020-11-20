package Triggers.Spawn;

import Main.GameMap;

import java.util.Set;

public class Count extends SpawnTriggers implements Cloneable{
    private final int targetNumber;
    private final int count;
    public Count(Set<Integer> group, int Spawn, GameMap gameMap, boolean multiTrigger, int targetNumber, int count) {
        super(group, gameMap, multiTrigger, Spawn);
        this.targetNumber = targetNumber;
        this.count = count;
    }

    @Override
    public void run() {
        while (!(stop || isToggled)){
            if(up.count[count]>=targetNumber){
                Spawn();
                return;
            }
        }
        isEnd = true;
    }

    @Override
    public Object clone(){
        Count clone = new Count(groups, SpawnGroup, up, multiTrigger, targetNumber, count);
        return clone;
    }
}
