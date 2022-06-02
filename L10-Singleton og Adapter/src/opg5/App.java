package opg5;

public class App {
    public static void main(String[] args) {
        ObservableBag ob = new ObservableBag();
        Lommetyv lt = new Lommetyv();

        ob.registerObserver(lt);

        ob.add("Rolex");
        ob.add("Rolex");
        ob.add("Ur");

        System.out.println();

        ob.remove("Rolex");
        ob.remove("Ur");
        ob.remove("Ur");
    }
}
