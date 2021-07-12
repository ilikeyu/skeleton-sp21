/**Class show SSList data structure
 */

public class SSlist{
	public SSlist first;

	public SSlist(int x){
		first = new intNode(x, null);
	}

	public addFirst(int x){
		first = new intNode(x, first);
	}

	public getFirst(){
		return first.item;
	}
}