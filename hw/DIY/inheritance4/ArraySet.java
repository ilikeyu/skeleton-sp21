package DIY.inheritance4;

public class ArraySet<T> implements Iterable<T> {

    public static final int INIT_SIZE = 100;
    private T[] item;
    private int size;

    public ArraySet() {
        item = (T[]) new Object[INIT_SIZE];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int index = 0; index < size; index++) {
            if ( item[index].equals(x) ){
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map. 
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if ( contains(x) ){
            return;
        }
        item[size]  = x;
        size += 1;
        return;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");        
        System.out.println(s.contains("horse"));        
        System.out.println(s.size());       
    }

    @Override
    public void IterateToString() {
        for (int index = 0; index < size; index++) {
            System.out.print( item[index] + " --> " );
        }
        System.out.println();
        return;
    }

    @Override
    public boolean equals(ArraySet as) {
        if (as.size() != size)
            return false;
        for (int index = 0; index < size; index++) {
            if ( !as.contains( item[index] ) )
                return false;
        }
        return true;
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
