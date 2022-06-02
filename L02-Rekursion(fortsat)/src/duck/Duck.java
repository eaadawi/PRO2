package duck;

public abstract class Duck {
    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String Fly() {
        return flyBehavior.fly();
    }
}
