/** Class contain a two-way list and one sentinel node and generic type
 * when manupilating its data, such as addlast, removelast, insertlast, 
 * 2-way will be an effective method.
 * @author luqing
 */

public class DbList<GeType>{

	private class GeNode{
		GeType item;
		GeNode front;
		GeNode next;

		GeNode(GeType i, GeNode f, GeNode n){
			item = i;
			front = f;
			next = n;
		}

	}

	public GeNode sentinel;
	int size;

	public DbList(GeType sen){
		sentinel = new GeNode(sen, null, null);
		sentinel.front = sentinel;
		sentinel.next = sentinel;
		size = 0;
	}

	/** add the first item */
	public void addFirst(GeType x){
		GeNode p = new GeNode(x, sentinel, sentinel.next);
		p.next.front = p;
		sentinel.next = p;
		size += 1;
	}

	/** add the last item */
	public void addLast(GeType x){
		GeNode p = new GeNode(x, sentinel.front, sentinel);
		sentinel.front = p;
		p.front.next = p;
		size += 1;
	}

	/** delete the last item */
	public void deleteLast(){
		if (sentinel.front == sentinel) {
			System.out.println("null");
			return;
		}
		GeNode p = sentinel.front;
		p.front.next = sentinel;
		sentinel.front = p.front;
		size -= 1;
	}

	/** get the size number of Double List */
	public int getSize(){
		return size;
	}

	/** normal order print */
	public void orderPrint(){
		GeNode p = sentinel.next;
		while( p != sentinel){
			System.out.print(p.item + " ");
			p = p.next;
		}
		System.out.println();
	}

	/** reverse order print */
	public void reversePrint(){
		GeNode p = sentinel.front;
		while( p != sentinel){
			System.out.print(p.item + " ");
			p = p.front;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DbList<Integer> dl = new DbList<>(5);
		dl.addFirst(10);
		dl.addFirst(15);
		dl.addLast(20);
//		dl.deleteLast();
		System.out.println(dl.getSize());
		dl.orderPrint();
		dl.reversePrint();
	}
}