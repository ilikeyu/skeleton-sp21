package deque;

public interface Deque<T> {

    //insert item in the front of the deque
    public void addFirst(T item);

    //insert item in the last of deque
    public void addLast(T item);

    public boolean isEmpty();

    public int size();

    public void printDeque();

    public T removeFirst();

    public T removeLast();

    public T get(int index);
}