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
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
