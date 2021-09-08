package deque;

import org.junit.Test;

import java.util.Comparator;
//import org.junit.Assert.assertEquals;

/**
 * @program: sp21
 * @description: test MaxArrayDeque function
 * @author: Keyu Li
 * @create: 2021-09-08 19:32
 **/

public class MaxArrayDequeTest {
    @Test
    public void maxWithEmbeddedComparatorTest(){
//        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>((a,b)->a-b);
//        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        MaxArrayDeque<Integer> mad = new MaxArrayDeque<>(new IntCompare());
        MaxArrayDeque<Double> mad = new MaxArrayDeque<>();
        for (double i = 0; i < 20; i+=2) {
            mad.addFirst(i+0.6);
            mad.addLast(i+1.2);
        }
        mad.printDeque();
//        System.out.println(mad.max());
        System.out.println(mad.max((a,b)->Double.compare(a,b)));
    }

    @Test
    public void maxStringTest(){
        MaxArrayDeque<String> madS = new MaxArrayDeque<>(StringCompare::compare);
        madS.addLast("miemiemmie");
        madS.addFirst("zzzaaaaa");
        madS.addLast("hauhuiadshfihsadihfi");
        madS.addFirst("zzzaaaa");
        madS.printDeque();
        System.out.println(madS.max());
    }

}

class StringCompare {
    static int compare(String s1, String s2) {
        //from first number to the end and compare each letter
        int l1 = s1.length();
        int l2 = s2.length();
        int slen = l1 < l2 ? l1 : l2;
        char c1, c2;
        for (int i = 0; i < slen; i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != c2) return c1 - c2;
        }
        return l1-l2;
    }
}

class IntCompare implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
