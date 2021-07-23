package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    /** calculate how long and how much time*/
    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        int numCount = 9;
        int numBase = 1000;

        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        for (int count = 0; count < numCount; count++) {

            Stopwatch sw = new Stopwatch();
            AList<Integer> al = new AList<>();
            for (int i = 0; i < numBase; i++) {
                al.addLast(1);
            }
            double timeInSecond = sw.elapsedTime();

            Ns.addLast(numBase);
            times.addLast(timeInSecond);
            opCounts.addLast(numBase);

            numBase = numBase * 2;
        }

        printTimingTable(Ns, times, opCounts);
    }
}
