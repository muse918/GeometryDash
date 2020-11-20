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
        if(stop||isToggled) {
            isEnd = true;
            return;
        }
        System.out.println(up.runTriggers.size());//debug
        super.Spawn();
        isEnd = true;
    }

    @Override
    public Object clone() {
        Spawn clone = new Spawn(groups, SpawnGroup, up, delay, multiTrigger);
        return clone;
    }
}