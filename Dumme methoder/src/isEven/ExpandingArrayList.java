package isEven;

import java.util.ArrayList;
import java.util.List;

public class ExpandingArrayList {
    public static boolean isEven(int num) {
        ArrayList<Boolean> res = new ArrayList(List.of(true,false));
        while(true) {
            try {
                return res.get(num);
            } catch (IndexOutOfBoundsException e) {
                res.addAll(res);
            }
        }
    }
}
