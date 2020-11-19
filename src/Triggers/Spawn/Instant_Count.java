package Triggers.Spawn;

import Main.GameMap;

import java.util.Set;

public class Instant_Count extends SpawnTriggers implements Cloneable{
    private final int targetNumber;
    private final int count;
    private final int mode;
    public static final int SMALLER = 1;
    public static final int EQUAL = 2;
    public static final int BIGGER = 3;
    public Instant_Count(Set<Integer> group, int Spawn, GameMap gameMap, boolean multiTrigger, int targetNumber, int count, int mode) {
        super(group, gameMap, multiTrigger, Spawn);
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

    @Override
    public Object clone() {
        return super.clone();
    }
}
