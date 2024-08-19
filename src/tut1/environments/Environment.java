package tut1.environments;

import tut1.tanks.Point2D;

public class Environment  {
    private String name;
    private String description;
    private Point2D position;

    public Environment(String name, String description, Point2D position) {
        this.name = name;
        this.description = description;
        this.position = position;
    }

    // TODO: Getters, Setters, toString,...
}
