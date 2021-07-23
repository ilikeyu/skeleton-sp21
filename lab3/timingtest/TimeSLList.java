package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> creatTimes, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s %12s\n", "N", "creat times", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double creattime = creatTimes.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12.2f %12d %12.2f\n", N, creattime, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {

        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Double> creatTimes = new AList<>();
        AList<Integer> opCounts = new AList<>();

        int numCall = 10000;
        int numBase = 1000;
        int numCount = 10;

        for (int count = 0; count < numCount; count++) {
            Stopwatch sw;
            double timeInSecond;

            sw = new Stopwatch();
            SLList<Integer> sl = new SLList<>(1);
            for (int i = 0; i < numBase; i++) {
                sl.addLast(i);
            }
            timeInSecond = sw.elapsedTime();
            creatTimes.addLast(timeInSecond);

            sw = new Stopwatch();
            for (int i = 0; i < numCall; i++) {
                int temp = sl.getLast();
            }
            timeInSecond = sw.elapsedTime();
            Ns.addLast(numBase);
            times.addLast(timeInSecond);
            opCounts.addLast(numCall);

            numBase *= 2;
        }

        printTimingTable(Ns, creatTimes, times, opCounts);
    }

}
