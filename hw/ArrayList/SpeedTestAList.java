public class SpeedTestAList {
    public static void main(String[] args) {
        AList al = new AList();
        for (int i = 0; i < 10000; i++) {
            al.addLast(i);
        }
    }
}
