package opg5;

public class Lommetyv implements Observer{

    @Override
    public void update(String s, int antal) {
        System.out.println("Tyven ser nu " + s + antal);
    }
}
