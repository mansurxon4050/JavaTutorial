import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k = 0, n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + "  ");
            }
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 1) {
                System.out.print(a[i] + "   ");
            }
        }
    }
}
