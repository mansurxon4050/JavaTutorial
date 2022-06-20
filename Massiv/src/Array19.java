import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        int min, max, l = 0, m = 0;
        for (int i = 0; i < n; i++) {
            min = a[n - 1];
            max = a[0];
            if (min > a[i] && max < a[i]) {
                l = a[i];
                m = 1;
            }
        }
        if (m == 1) System.out.print(l + " ");

    }
}
