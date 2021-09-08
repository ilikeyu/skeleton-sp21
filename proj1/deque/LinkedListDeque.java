package deque;

public class LinkedListDeque<T> implements Deque<T> {

    // node class of the list
    public class queNode{
    //why public ?
        T nodeItem;
        public queNode next;
        public queNode back;

        public queNode(T item, queNode n, queNode b){
            //constructor do not need return type!!!
            nodeItem = item;
            next = n;
            back = b;
        }
    }

    private int size;
    private queNode sentinel;

    public LinkedListDeque(){
        size = 0;
        sentinel = new queNode(null, null, null);
        sentinel.next = sentinel;
        sentinel.back = sentinel;

    }

    public LinkedListDeque(T item){
        size = 1;
        sentinel = new queNode(null, null, null);
        queNode temp = new queNode(item, sentinel, sentinel);
        sentinel.back = temp;
        sentinel.next = temp;
    }

    @Override
    public void addFirst(T item) {
        queNode temp = new queNode(item, sentinel.next, sentinel);
        sentinel.next.back = temp;
        sentinel.next = temp;
        size += 1;
    }

    @Override
    public void addLast(T item) {
        queNode temp = new queNode(item, sentinel, sentinel.back);
        sentinel.back.next = temp;
        sentinel.back = temp;
        size += 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        if ( isEmpty() ) {
            System.out.println("empty linked list!");
            return;
        }

        queNode temp = sentinel;
        for (int i = 0; i < size(); i++) {
            System.out.print(temp.nodeItem + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public T removeFirst() {
        if ( isEmpty() ) {
            //System.out.println("empty linked list!");
            return null;
        }
        queNode temp = sentinel.next;
        sentinel.next = temp.next;
        temp.next.back = sentinel;
        size -= 1;

        T item = temp.nodeItem;
        temp = null;
        return item;
    }

    @Override
    public T removeLast() {
        if ( isEmpty() ) {
            //System.out.println("empty linked list!");
            return null;
        }
        queNode temp = sentinel.back;
        sentinel.back = temp.back;
        temp.back.next = sentinel;
        size -= 1;

        T item = temp.nodeItem;
        temp = null;
        return item;
    }

    private boolean boundDetect(int index){
        if ( isEmpty() || index>size()) {
            //System.out.println("empty linked list!");
            return false;
        }

        return true;
    }

    @Override
    // get the nth item.
    public T get(int index) {

        if ( !boundDetect(index) ){
            return null;
        }
        queNode temp = sentinel;
        if ( index< size>>1 ){
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
        }else{
            for (int i = size; i >= index; i--) {
                temp =temp.back;
            }
        }
        return temp.nodeItem;

    }

    private T getRecurHelper(queNode temp, int index){
        if (index == 1) {
            return temp.nodeItem;
        }
        return getRecurHelper(temp.next,index-1);
    }

    public T getRecursive(int index){

        if ( !boundDetect(index) ){
            return null;
        }
        return getRecurHelper(this.sentinel.next, index);
    }
}
