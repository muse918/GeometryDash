package Triggers;

import Main.GameMap;

import java.util.Set;

public class Toggle extends Trigger implements Cloneable{
    private final int toggleGroup;
    private final boolean mode;
    public static final boolean ON = true;
    public static final boolean OFF = false;
    public Toggle(Set<Integer> group, GameMap gameMap, boolean multiTrigger, int toggleGroup, boolean mode) {
        super(group, gameMap, multiTrigger);
        this.toggleGroup = toggleGroup;
        this.mode = mode;
    }

    @Override
    public void run() {
        up.toggle(toggleGroup, mode);
        isEnd = true;
    }
    @Override
    public Object clone(){
        Toggle clone = new Toggle(groups, up, multiTrigger, toggleGroup, mode);
        return clone;
    }
}
