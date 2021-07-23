package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import timingtest.AList;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void randomizedTest(){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> BugL = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);

            switch (operationNumber){
                case 0:
                    //addLast
                    int randVal = StdRandom.uniform(0, 100);
                    L.addLast(randVal);
                    BugL.addLast(randVal);
                    //System.out.println("addLast(" + randVal + ").");
                    break;

                case 1:
                    //getLast
                    assertEquals(L.size(), BugL.size());
                    if (L.size() != 0){
                        int lastValL = L.getLast();
                        int lastValBug = BugL.getLast();
                        assertEquals(lastValL, lastValBug);
                        //System.out.println("getLast(" + lastValL +").");
                    }else{
                        System.out.println("L has no item");
                    }
                    break;

                case 2:
                    //removeLast
                    assertEquals(L.size(), BugL.size());
                    if (L.size() != 0){
                        int lastValL = L.removeLast();
                        int lastValBug = BugL.removeLast();
                        assertEquals(lastValL, lastValBug);
                        //System.out.println("last value " + lastValL +" removed.");
                        assertEquals(L.size(), BugL.size());
                    }else{
                        System.out.println("L has no item");
                    }
                    break;

                case 3:
                    //print size
                    int size = L.size();
                    assertEquals(size, BugL.size());
                    System.out.println("size: " + size);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + operationNumber);
            }
            /**
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            }
             */
        }
    }
}
