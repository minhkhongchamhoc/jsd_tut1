package tut1.tanks;

public class FastTank extends EnemyTank{
    private Directions direction;
    public FastTank(Point2D position) throws Exception {
        super("Fast Tank", position, 400, 4, 2, 2, "Desc");
        this.direction = Directions.DOWN;
    }
    // TODO: Getters, Setters, toString,...
}
