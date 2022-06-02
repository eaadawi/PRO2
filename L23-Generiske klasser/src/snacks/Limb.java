package snacks;

import java.util.Random;

public class Limb extends Snack implements Comparable<Limb>
{

    public enum Types
    {
        Finger, Foot, Hand, Heel, Knee, Toe
    }

    private Types type;

    public Limb()
    {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];

    }

    public Limb(Types type)
    {
        Random random = new Random();
        this.type = type;
    }

    public Types getType()
    {
        return type;
    }


    @Override
    public int compareTo(Limb o) {
        return (int) (getWeight()*100 - o.getWeight()*100);
    }
}
