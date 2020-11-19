package Trigger.Spawn;

import Main.GameMap;

import java.util.Set;

public class Instant_Count extends SpawnTriggers{
    private final int targetNumber;
    private final int count;
    private final int mode;
    public Instant_Count(Set<Integer> set, int Spawn, GameMap gameMap, boolean multiTrigger, int targetNumber, int count, int mode) {
        super(set, Spawn, gameMap, multiTrigger);
        this.targetNumber = targetNumber;
        this.count = count;
        this.mode = mode;
    }

    @Override
    public void run() {
        switch (mode){
            case 1:
                if(up.count[count]<targetNumber){
                    Spawn();
                }
                break;
            case 2:
                if(up.count[count]==targetNumber){
                    Spawn();
                }
                break;
            case 3:
                if(up.count[count]>targetNumber){
                    Spawn();
                }
                break;
        }
    }
}
