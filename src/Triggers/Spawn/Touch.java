package Triggers.Spawn;

import Main.GameMap;

import java.util.Set;

public class Touch extends SpawnTriggers implements Cloneable{
    private final boolean holdOn;
    public Touch(Set<Integer> group, int Spawn, GameMap gameMap, boolean multiTrigger, boolean holdOn) {
        super(group, gameMap, multiTrigger, Spawn);
        this.holdOn = holdOn;
    }

    @Override
    public void run() {
        while (!(stop || isToggled)){
            if(up.touch){
                Spawn();
                if(!holdOn){
                    while (up.touch){onSpinWait();}
                }
            }
        }
        isEnd = true;
    }

    @Override
    public Object clone() {
        Touch clone = new Touch(groups, SpawnGroup, up, multiTrigger, holdOn);
        return clone;
    }
}
