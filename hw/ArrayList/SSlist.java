/**Class show SSList data structure
 */

public class SSlist{


	private static class intNode{
		public int item;
		public intNode next;

		public intNode(int i, intNode n){
			item = i;
			next = n;
		}
	}

	public intNode sentinel;
	public int size;

	public SSlist(){
		size = 0;
		sentinel = new intNode(0, null);
	}

	/** adds an item to the first of the list. */
	public void addFirst(int x){
		sentinel.next = new intNode(x, sentinel.next);
		sentinel.item += 1;
		size += 1;
	}
	/** adds an item to the end of the list. */
	public void addLast(int x){
		sentinel.item += 1;
		size += 1;
		intNode p = sentinel;
		while(p.next != null){
			p = p.next;
		}
		p.next = new intNode(x, null);
	}

	/** get the first item. */
	public int getFirst(){
		return sentinel.next.item;
	}

	/** get the size of the list from a particular position */
	public static int sizeFromP(intNode p){
		if( p.next == null ){
			return 1;
		}
		return 1 + sizeFromP(p.next);
	}

	public int getSize(){
		//return sizeFromP(sentinel.next);
		return size;
	}

	public static void main(String[] args){
		SSlist L = new SSlist();
		L.addFirst(10);
		L.addFirst(15);
		L.addLast(20);
		System.out.println(L.getSize() + "+" + L.sentinel.item);
	}
}