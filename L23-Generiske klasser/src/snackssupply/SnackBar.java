package snackssupply;

import snacks.Snack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SnackBar<E extends Comparable<E>>
{
    // TODO: Implement sortSnacks(E[] snackContainer)
    public ArrayList<E> sortSnacks(E[] snackContainer) {
        ArrayList<E> list = new ArrayList<>(List.of(snackContainer));
        Collections.sort(list);
        return list;
    }
}
