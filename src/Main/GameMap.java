package Main;

import Triggers.Trigger;

import java.util.LinkedList;

public class GameMap implements Cloneable{
    public volatile boolean touch = false;
    LinkedList<Trigger> initTriggers = new LinkedList<>();
    public volatile int[] count = new int[999];
    public LinkedList<Trigger>[] groups = new LinkedList[999];
    private LinkedList<Trigger> runTriggers = new LinkedList<>();
    private LinkedList<Trigger> triggers = new LinkedList<>();
    public GameMap(){
        //초기화
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new LinkedList<>();
        }
    }
    public void setInit(LinkedList<Trigger> init){
        initTriggers = init;
    }
    public void start(){
        for (Trigger run:initTriggers) {
            run.isTriggered = true;
            runTriggers.add(run);
            run.start();
        }
    }
    public void run(int group){
        for (int i = 0; i < groups[group].size(); i++) {
            if(groups[group].get(i).multiTrigger||groups[group].get(i).isTriggered){
                groups[group].get(i).isTriggered = true;
                Trigger trigger = (Trigger) groups[group].get(i).clone();
                runTriggers.add(trigger);
                trigger.start();
            }
        }
    }
    public void stop(int group){
        for (int i = 0; i < runTriggers.size(); i++) {
            if(runTriggers.get(i).groups.contains(group)) {
                runTriggers.get(i).stopTrigger();
                runTriggers.remove(i);
                i--;
            }
        }
    }
    public void toggle(int group, boolean mode){
        for (int i = 0; i < groups[group].size(); i++) {
            if(groups[group].get(i).multiTrigger||groups[group].get(i).isTriggered){
                groups[group].get(i).isToggled = mode;
            }
        }


        if(mode){
            for (int i = 0; i < runTriggers.size(); i++) {
                if(runTriggers.get(i).groups.contains(group)) {
                    runTriggers.get(i).stopTrigger();
                    runTriggers.remove(i);
                    i--;
                }
            }
        }
    }
}