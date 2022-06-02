package snacks;

import java.util.Random;

public class Smartie extends Snack implements Comparable<Smartie>
{

    public enum Colors
    {
        Red, Orange, Blue, Green, Yellow, Pink, Violet, Brown
    }

    private Colors color;

    public Smartie()
    {
        Random random = new Random();
        Colors[] colors = Colors.values();
        this.color = colors[random.nextInt(colors.length)];
    }

    public Smartie(Colors color)
    {
        this.color = color;
    }

    public Colors getColor()
    {
        return color;
    }

    @Override
    public int compareTo(Smartie o) {
        return color.compareTo(o.color);
    }
}
