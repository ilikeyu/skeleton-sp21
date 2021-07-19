package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(329, 324, 121, 23, 27, 105, 188, 101);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("329 -> 324 -> 121 -> 529 -> 27 -> 105 -> 188 -> 10201", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple3() {
        IntList lst = IntList.of(329, 324, 121, 20, 27, 105, 188, 100);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("329 -> 324 -> 121 -> 20 -> 27 -> 105 -> 188 -> 100", lst.toString());
        assertFalse(changed);
    }
}
