/*
* 변수의 값을 증가 시켜줌
* */

package Trigger;

import Main.GameMap;

import java.util.Set;

public class Pickup extends Trigger{

    private final int pickupCount;
    private final int pickupNumber;
    public Pickup(Set<Integer> set, GameMap gameMap, int pickupCount, int pickupNumber, boolean multiTrigger) {
        super(set, gameMap, multiTrigger);
        this.pickupCount = pickupCount;
        this.pickupNumber = pickupNumber;
    }

    @Override
    public void run() {//실행
        up.count[pickupCount]+=pickupNumber;//
    }//자신을 포함하는 GameMap의 변수를 수정
}
