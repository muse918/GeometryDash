package Trigger;

import Main.GameMap;

import java.util.HashSet;
import java.util.Set;

public abstract class Trigger extends Thread{
    protected Set<Integer> groups = new HashSet<>();
    protected GameMap up;

    public Trigger(Set<Integer> set, GameMap gameMap){
        groups = set;
        up = gameMap;
    }

    public void Spawned(){

    }

    @Override
    public void run() {
    }
}
