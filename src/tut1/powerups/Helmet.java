package tut1.powerups;

import tut1.tanks.Point2D;

public class Helmet extends PowerUp{

    public Helmet(String name, String description, Point2D position) {
        super("Helmet", description, position);
    }



    @Override
    public void touching() {

    }

    @Override
    public void disappear() {

    }
}
