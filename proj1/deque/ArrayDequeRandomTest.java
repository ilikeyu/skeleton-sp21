package deque;

import org.junit.Test;
import edu.princeton.cs.algs4.StdRandom;

import static org.junit.Assert.*;


/* perform some basic Array deque test*/
public class ArrayDequeRandomTest {

    @Test
    public void addTest(){
        ArrayDeque<Integer> adque = new ArrayDeque<>();
        for (int i = 0; i < 5000000; i++) {
            adque.addFirst(i);
            assertEquals(i+1, adque.size());
            //System.out.print(adque.getNextFirst()+ " ");
        }
        System.out.println("\n");
        //adque.printDeque();
        for (int i = 0; i < 5000000; i++) {
            adque.addLast(i+5000000);
            //int actual = adque.get(i);
            //assertEquals(i+50, actual);

            adque.removeFirst();
            //assertEquals(i, actual);
            assertEquals(5000000, adque.size());
            //System.out.print(adque.getNextLast() + " ");
        }
        System.out.println("\n");
        //adque.printDeque();
    }

    public static final int LOOP1 = 50;
    public static final int LOOP2 = 10;
    public static final int LOOP3 = 5;

    @Test
    public void RandomTest(){
        ArrayDeque<Integer> adeque = new ArrayDeque<>();
        int randVal;
        for (int i = 0; i < LOOP1; i++) {
            int operator = StdRandom.uniform(0, 5);
            switch (operator){
                case 0:
                    randVal = StdRandom.uniform(10,60);
                    for (int j = 0; j < LOOP3; j++) {
                        adeque.addLast(randVal);
                    }
                    System.out.println("add last " + randVal);
                    adeque.printDeque();
                    break;
                case 1:
                    randVal = StdRandom.uniform(10,60);
                    for (int j = 0; j < LOOP3; j++) {
                        adeque.addFirst(randVal);
                    }
                    System.out.println("add first " + randVal);
                    adeque.printDeque();
                    break;
                case 2:
                    adeque.removeFirst();
                    System.out.println("remove first number");
                    adeque.printDeque();
                    break;
                case 3:
                    adeque.removeLast();
                    System.out.println("remove last number");
                    adeque.printDeque();
                    break;
                case 4:
                    for (int j = 0; j < LOOP2; j++) {
                        randVal = StdRandom.uniform(0, 15);
                        if ( adeque.get(randVal) != null ){
                            System.out.println("the " +randVal+ "th number is " + adeque.get(randVal));
                        }
                    }
                    break;
            }
        }
    }
}
