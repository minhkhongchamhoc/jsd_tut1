package tut1.powerups;

import tut1.tanks.Point2D;

public class Grenade extends PowerUp{

    public Grenade(String name, String description, Point2D position) {
        super("Grenade", description, position);
    }



    @Override
    public void touching() {

    }

    @Override
    public void disappear() {

    }
}
