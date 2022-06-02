package duck;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new FlyNoWay());
    }
}
