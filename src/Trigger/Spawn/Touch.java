package Trigger.Spawn;

import Main.GameMap;

import java.util.Set;

public class Touch extends SpawnTriggers{
    private final boolean holdOn;
    public Touch(Set<Integer> set, int Spawn, GameMap gameMap, boolean multiTrigger, boolean holdOn) {
        super(set, Spawn, gameMap, multiTrigger);
        this.holdOn = holdOn;
    }

    @Override
    public void run() {
        while (!stop){
            if(up.touch){
                Spawn();
                if(!holdOn){
                    while (up.touch){onSpinWait();}
                }
            }
        }
    }
}
