public class AList {

    private int[] item;
    private int size;

    /** Create empty list*/
    public AList(){
        item = new int[100];
        size = 0;
    }

    /** resize the array to hold all boxes*/
    public void resize(int num){
        int[] a = new int[item.length + num];
        System.arraycopy(item, 0, a, 0, size);
        item = a;
    }

    /** Insert X into the back of the list. */
    public void addLast(int x){
        if (size == item.length) {
            resize(1);
        }
        item[size] = x;
        size += 1;
    }
}
