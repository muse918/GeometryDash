package Triggers.Spawn;

import Main.GameMap;

import java.util.Set;

public class Spawn extends SpawnTriggers implements Cloneable{
    private final double delay;
    public Spawn(Set<Integer> group, int Spawn, GameMap gameMap, double del, boolean multiTrigger) {
        super(group, gameMap, multiTrigger, Spawn);
        delay = del;
    }

    @Override
    public void run() {
        try {
            sleep((long) delay*1000);
        } catch (InterruptedException e) {}
        if(stop||isToggled)return;
        super.Spawn();
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}