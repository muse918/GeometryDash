/**/

package Trigger;

import Main.GameMap;

import java.util.Set;

public class Pickup extends Trigger{

    private final int pickupCount;
    private final int pickupNumber;
    public Pickup(Set<Integer> set, GameMap gameMap, int pickupCount, int pickupNumber) {
        super(set, gameMap);
        this.pickupCount = pickupCount;
        this.pickupNumber = pickupNumber;
    }

    @Override
    public void run() {
        up.count[pickupCount]+=pickupNumber;
    }
}
