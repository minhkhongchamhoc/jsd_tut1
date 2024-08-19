package tut1.tanks;

public class PowerTank extends EnemyTank{
    private Directions direction;
    public PowerTank(Point2D position) throws Exception {
        super("Power Tank", position, 300, 1, 2, 3, "Desc");
        this.direction = Directions.DOWN;
    }
    // TODO: Getters, Setters, toString,...
}
