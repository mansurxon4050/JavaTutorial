import java.util.Scanner;

public class Massiv53 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2];
        System.out.print(" a[i] ni kiriting : ");
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        System.out.print(" b[i] ni kiriting : ");
        for (int i = 0; i < n; i++) {
            b[i] = kirit.nextInt();
        }
        int max1 = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            if (max1 < a[i]) {
                max1 = a[i];
            }
            if (max2 < b[i]) {
                max2 = b[i];
            }
        }
        System.out.print(" c[i]: ");
        for (int i = 0; i < 2; i++) {
            c[0] = max1;
            c[1] = max2;
            System.out.print(c[i] + " ");
        }
    }
}
