/**Class create an Integer Class and manipulate it
 * @author luqing
 */

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        this.first = f;
        this.rest = r;
    }

    // get IntList size
    public int getListSize(){
        if (this.rest == null) {
            return 1;
        }
        return this.rest.getListSize() + 1;
    }

    // get the ith number
    public int getIthNum(int i){
        if (i == 0){
            return this.first;
        }
        return this.rest.getIthNum(i-1);
    }

    public static void main(String[] args) {
        int[] IntArr = new int[]{10, 15, 35, 34, 45};
        IntList L = null;
        for (int i = 0; i < IntArr.length; i++) {
            L = new IntList(IntArr[i], L);
        }
        System.out.println(L.getListSize());
        System.out.println(L.getIthNum(0));
        System.out.println(L.getIthNum(3));
    }
}