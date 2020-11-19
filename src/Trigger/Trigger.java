/*
* 모든 트리거의 기본
* */

package Trigger;

import Main.GameMap;

import java.util.Set; 

public abstract class Trigger extends Thread{
    public Set<Integer> groups;//내가 속한 그룹(쓸모 있는지 없는지 모름)
    protected GameMap up;//자신을 포함하고 있는 GameMap 객체(외부 트리거와의 연동을 담당)
    protected volatile boolean stop = false;//stop 여부
    protected final boolean multiTrigger;

    public Trigger(Set<Integer> set, GameMap gameMap, boolean multiTrigger){//생성자
        groups = set;
        up = gameMap;
        this.multiTrigger = multiTrigger;
        for (int x:set) {
            gameMap.groups[x].add(this);
        }
    }

    @Override
    public void run() {//실행
    }

    public void stopTrigger(){//정지
        stop = true;
    }
}
