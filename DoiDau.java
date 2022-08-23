package studyJavaPTIT;

import java.util.*;

public class DoiDau {
    static long daoDau(long sum, int[] a, int n, int k) {
        Arrays.sort(a);
        List<Integer> zero = new ArrayList<>(), neg = new ArrayList<>();
        
        int d = 0;
        while (d < n && a[d] < 0) 
            neg.add(a[d++]);
        while (d < n && a[d] == 0) 
            zero.add(a[d++]);
        if (k <= neg.size()) {
            for (int i = 0; i < k; i++)
                sum -= 2 * neg.get(i);
        } else {
            for (int i : neg) sum -= 2 * i;
            if (zero.isEmpty() && (k - neg.size()) % 2 == 1) {
                int token = a[d];
                if (d < n) {
                    token = a[d];
                    if (!neg.isEmpty()) {
                        token = Integer.min(a[d], -neg.get(neg.size()-1));
                        sum -= token;
                    }
                    sum -= token;
                }
                else if (!neg.isEmpty()) {
                        token = -neg.get(neg.size()-1);
                        sum -= 2*token;
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(daoDau(sum, a, n, k));
    }
}