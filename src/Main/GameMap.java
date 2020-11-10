package Main;

import Trigger.Trigger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GameMap {
    public volatile boolean touch = false;
    Set<Trigger> initTriggers = new HashSet<>();
    public int[] count = new int[999];
    LinkedList<Trigger>[] groups = new LinkedList[999];
    public GameMap(){
        
    }
    public void setInit(Set<Trigger> init){
        initTriggers = init;
    }
    public void run(int group){
        for (Trigger run:groups[group]) {
            run.start();
        }
    }
}