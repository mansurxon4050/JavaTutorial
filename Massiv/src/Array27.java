import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] % 2 == 0 && a[i + 1] == 1) {
                System.out.println(0);
            }
        }
    }
}
