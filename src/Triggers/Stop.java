package Triggers;

import Main.GameMap;

import java.util.Set;

public class Stop extends Trigger implements Cloneable{
    private final int stopGroup;

    public Stop(Set<Integer> group, GameMap gameMap, boolean multiTrigger, int stopGroup) {
        super(group, gameMap, multiTrigger);
        this.stopGroup = stopGroup;
    }



    public void run(){
        up.stop(stopGroup);//중지 요청
        isEnd = true;
    }

    @Override
    public Object clone() {
        Stop clone = new Stop(groups, up, multiTrigger, stopGroup);
        return clone;
    }
}