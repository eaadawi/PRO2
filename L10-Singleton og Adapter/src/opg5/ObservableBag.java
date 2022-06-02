package opg5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ObservableBag implements Bag{
    private HashMap<String, Integer> observableBag = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(String s) {
        if(observableBag.containsKey(s)) {
            observableBag.replace(s, getCount(s), getCount(s)+1);
        }else {
            observableBag.put(s, 1);
        }
        for(Observer o : observers) {
            o.update(s, getCount(s));
        }

    }

    @Override
    public void remove(String s) {
        if(observableBag.containsKey(s)) {
            if(observableBag.get(s) == 1) {
                observableBag.remove(s, 1);
            }else {
                observableBag.replace(s, getCount(s), getCount(s) - 1);
            }
        }
        for(Observer o : observers) {
            if(observableBag.containsKey(s)) {
                o.update(s, getCount(s));
            }else {
                o.update(s, 0);
            }
        }
    }

    @Override
    public int getCount(String s) {
        return observableBag.get(s);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o));
            observers.remove(o);
    }
}
