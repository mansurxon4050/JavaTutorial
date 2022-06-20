import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k = 0, n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = n-1; i >= 1; i-=2) {
            System.out.print(a[i]+" ");
        }
    }
}
