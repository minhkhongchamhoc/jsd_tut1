package tut1.powerups;

import tut1.tanks.Point2D;

public class PowerUp extends PowerUpFunction{
    private String name;
    private String description;
    private Point2D position;


    public PowerUp(String name, String description, Point2D position) {
        this.name = name;
        this.description = description;
        this.position = position;
    }

    // TODO: Getters, Setters, toString,...

    @Override
    public void touching() {

    }

    @Override
    public void disappear() {

    }


}
