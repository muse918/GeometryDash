package Main;

import Trigger.Trigger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GameMap {
    public volatile boolean touch = false;
    Set<Trigger> initTriggers = new HashSet<>();
    public volatile int[] count = new int[999];
    public LinkedList<Trigger>[] groups = new LinkedList[999];
    private LinkedList<Trigger> runTriggers;
    public GameMap(){
        
    }
    public void setInit(Set<Trigger> init){
        initTriggers = init;
    }
    public void run(int group){
        for (Trigger run:groups[group]) {
            runTriggers.add(run);
            run.start();
        }
    }
    public void stop(int group){
        for (int i = 0; i < runTriggers.size(); i++) {
            if(runTriggers.get(i).groups.contains(group))runTriggers.get(i).stopTrigger();
        }
    }
}