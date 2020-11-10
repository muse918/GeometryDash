package Trigger.Spawn;

import Main.GameMap;

import java.util.Set;

public class Touch extends SpawnTriggers{
    private final boolean holdOn;
    public Touch(Set<Integer> set, int Spawn, GameMap gameMap, boolean holdOn) {
        super(set, Spawn, gameMap);
        this.holdOn = holdOn;
    }

    @Override
    public void run() {
        while (true){
            if(up.touch){
                if(!holdOn){
                    while (up.touch){onSpinWait();}
                }else{
                    while (up.touch){
                        
                    }
                }
            }
        }
    }
}
