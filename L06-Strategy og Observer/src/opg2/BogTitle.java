package opg2;

import java.util.ArrayList;
import java.util.List;

public class BogTitle implements Subject{
    private String titel;
    private  int antal;

    private List<Kunde> Kunder = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public BogTitle(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        antal--;
        Kunder.add(k);
        k.bogTitles.add(this);
        notifyObservers();
    }

    public ArrayList<Kunde> getKunder() {
        return new ArrayList<>(Kunder);
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
