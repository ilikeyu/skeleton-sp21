package deque;

import java.util.Comparator;

/**
 * @program: sp21
 * @description: use user defined comparator to compare elements
 * @author: Keyu Li
 * @create: 2021-09-08 17:21
 **/

public class MaxArrayDeque<T> extends ArrayDeque<T> {
    private Comparator<T> comparator;

    public MaxArrayDeque() {
    }

    public MaxArrayDeque(Comparator<T> c) {
        this.comparator = c;
    }

    public T max() {
        if (isEmpty()) return null;
        T maxValue = get(1);
        for (int i = 1; i <= size(); i++) {
            maxValue = comparator.compare(maxValue, get(i)) > 0 ? maxValue : get(i);
        }
        return maxValue;
    }

    public T max(Comparator<T> c){
        if (isEmpty()) return null;
        T maxValue = get(1);
        for (int i = 1; i <= size(); i++) {
            maxValue = c.compare(maxValue, get(i)) > 0 ? maxValue : get(i);
        }
        return maxValue;
    }
}
