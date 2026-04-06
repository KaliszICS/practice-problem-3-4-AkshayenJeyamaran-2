import java.util.HashSet;
public class PracticeProblem {
    public static int[] recaman(int n) {
        if (n <= 0) {
            return new int[]{};
        }
        int[] seq = new int[n];
        HashSet<Integer> set = new HashSet<>();
        seq[0] = 1;
        set.add(1);
        recamanReal(1, n, seq, set);
        return seq;
    }
    public static void recamanReal(int i, int n, int[] seq, HashSet<Integer> set) {
        if (i >= n) {
            return;
        }
        int prev = seq[i - 1];
        int step = i + 1; 
        int candidate = prev - step;
        if (candidate > 0 && !set.contains(candidate)) {
            seq[i] = candidate;
        } 
		else {
            seq[i] = prev + step;
        }
        set.add(seq[i]);
        recamanReal(i + 1, n, seq, set);
    }
}