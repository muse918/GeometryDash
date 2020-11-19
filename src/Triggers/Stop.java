package Triggers;

import Main.GameMap;

import java.util.Set;

public class Stop extends Trigger implements Cloneable{
    private final int StopGroup;

    public Stop(Set<Integer> group, GameMap gameMap, boolean multiTrigger, int stopGroup) {
        super(group, gameMap, multiTrigger);
        StopGroup = stopGroup;
    }



    public void run(){
        up.stop(StopGroup);//중지 요청
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}