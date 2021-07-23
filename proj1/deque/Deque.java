package deque;

public interface Deque<T> {

    //insert item in the front of the deque
    public void addFirst(T item);

    //insert item in the last of deque
    public void addLast(T item);

    default boolean isEmpty(){
        if( size() == 0 ){
            return true;
        }
        return false;
    }

    public int size();

    public void printDeque();

    public T removeFirst();

    public T removeLast();

    public T get(int index);
}