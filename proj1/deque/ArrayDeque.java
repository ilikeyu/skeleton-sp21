package deque;

public class ArrayDeque<T> implements Deque<T> {

//    public class unitArray<T>{
//        public T itemArray;
//        public unitArray next;
//        public unitArray back;
//
//        public unitArray(T i, unitArray n, unitArray b){
//            itemArray = i;
//            next = n;
//            back = b;
//        }
//    }

    private T[] ad;
    private int size;
    private int nextFirst;
    private int nextLast;
    public static final int INIT_LENGTH = 8;
    //    public static final int ENLARGE_FLAG = 1;
//    public static final int REDUCE_FLAG = 2;
    public static final double RESIZE_RATIO = 1.2;

    public ArrayDeque() {
        ad = (T[]) new Object[INIT_LENGTH];
        size = 0;
        nextFirst = ad.length >> 1;
        nextLast = nextFirst - 1;
    }

    public ArrayDeque(int len) {
        ad = (T[]) new Object[len];
        size = 0;
        nextFirst = ad.length >> 1;
        nextLast = nextFirst - 1;
    }

    // detect whether need to extend or minimize space.
    private boolean needResizeArray() {
        if (size() >= ad.length - 1) return true;
        return ad.length > INIT_LENGTH && size() <= Math.round(ad.length / 4);
    }

    //    private boolean notEnoughSpaceDetect() {
//        if ( size() < ad.length ){
//            return true;
//        }
//        return false;
//    }
//    private boolean extraSpaceDetect() {
//        if ( size() <= Math.round(ad.length/4) ){
//            return true;
//        }
//        return false;
//    }
    // resize the whole array. resizeflag = 1 extend; 2 minimize.
    private void resize() {
        int capacity = (int) Math.round(size() * RESIZE_RATIO);
        T[] adNewSize = (T[]) new Object[capacity];
        int newNextFirst = Math.round((adNewSize.length - size()) >> 1);
        int newNextLast = newNextFirst + size() - 1;

        for (int index = newNextFirst; index <= newNextLast; index++) {

            if (nextFirst == ad.length) {
                nextFirst = 0;
            }
            adNewSize[index] = ad[nextFirst];
            if (nextFirst == nextLast) {
                if (index != newNextLast)
                    System.out.println("Resize Array List Error!");
            }
            nextFirst++;
        }

        nextFirst = newNextFirst;
        nextLast = newNextLast;
        ad = adNewSize;

    }
    // detect whether nextfirst or nextlast reach bound
//    private boolean nextFirstReachBound(){
//        if (nextFirst == 0){
//            nextFirst = ad.length;
//            return true;
//        }
//        return false;
//    }
//    private boolean nextLastReachBound(){
//        if (nextLast == ad.length-1){
//            nextLast = -1;
//            return true
//        }
//        return false;
//    }

    @Override
    public void addFirst(T item) {

        if (needResizeArray()) {
            resize();
        }

        if (nextFirst == 0) {
            nextFirst = ad.length;
        }
        nextFirst = nextFirst - 1;
        ad[nextFirst] = item;
        size += 1;
    }

    @Override
    public void addLast(T item) {

        if (needResizeArray()) {
            resize();
        }
        if (nextLast == ad.length - 1) {
            nextLast = -1;
        }
        nextLast = nextLast + 1;
        ad[nextLast] = item;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }

    public int getNextFirst() {
        return nextFirst;
    }

    public int getNextLast() {
        return nextLast;
    }

    @Override
    public void printDeque() {
        if (isEmpty()) {
            System.out.println("Empty Array!");
            return;
        }
        int index = nextFirst;
        for (int i = 0; i < size(); i++) {
            if (index == ad.length) {
                index = 0;
            }
            System.out.print(ad[index] + " ");
            index++;
        }
        System.out.println();
    }

    @Override
    public T removeFirst() {
        if (isEmpty())
            return null;

        size -= 1;
        T temp = ad[nextFirst];

        if (needResizeArray()) {
            resize();
            return temp;
        }

        ad[nextFirst] = null;
        if (nextFirst == ad.length - 1) {
            nextFirst = -1;
        }
        nextFirst = nextFirst + 1;
        return temp;
    }

    @Override
    public T removeLast() {
        if (isEmpty())
            return null;

        size -= 1;
        T temp = ad[nextLast];

        if (needResizeArray()) {
            resize();
            return temp;
        }

        ad[nextLast] = null;
        if (nextLast == 0) {
            nextLast = ad.length;
        }
        nextLast = nextLast - 1;
        return temp;
    }

    private boolean boundOutOfDetect(int index) {
        if (isEmpty() || index > size()) {
            return true;
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (boundOutOfDetect(index))
            return null;
        return ad[(nextFirst + index - 1) % ad.length];
    }
}
