public class windowPosSum {
    /** Class uses a specific methold to manipulate an array.
     * @author luqing
     */
    public static void arrayCal(int[] num, int n){
        for (int i=0; i<num.length; i++){
            if (num[i] < 0){
                continue;
            }
            for (int j=1; j<=n; j++){
                if (i+j >= num.length){
                    break;
                }
                num[i] += num[i+j];
            }
        }

        priAry(num);
    }

    public static void priAry(int[] num){
        for (int unit : num){
            System.out.print(" "+ unit);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = new int[]{0, 10, 110, -3, 8 , 10, 12344};
        int n = 3;
        priAry(num);
        arrayCal(num, n);
        priAry(num);
    }
}
