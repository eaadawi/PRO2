package opg5;

import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
}
