package tut1.tanks;

public class ArmorTank extends EnemyTank{
    private Directions direction;
    public ArmorTank(Point2D position) throws Exception {
        super("Armor Tank", position, 400, 4, 2, 2, "Desc");
        this.direction = Directions.DOWN;
    }
    // TODO: Getters, Setters, toString,...
}
