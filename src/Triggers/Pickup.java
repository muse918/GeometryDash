/*
* 변수의 값을 증가 시켜줌
* */

package Triggers;

import Main.GameMap;

import java.util.Set;

public class Pickup extends Trigger implements Cloneable{

    private final int pickupCount;
    private final int pickupNumber;
    public Pickup(Set<Integer> group, GameMap gameMap, boolean multiTrigger, int pickupNumber, int pickupCount) {
        super(group, gameMap, multiTrigger);
        this.pickupCount = pickupCount;
        this.pickupNumber = pickupNumber;
    }

    @Override
    public void run() {//실행
        up.count[pickupCount]+=pickupNumber;//
    }//자신을 포함하는 GameMap의 변수를 수정

    @Override
    public Object clone() {
        return super.clone();
    }
}
