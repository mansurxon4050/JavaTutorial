import java.util.Scanner;

public class Massiv54 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        int k = 0;
        System.out.print("a[i] ni kiriting : ");
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
            if (a[i] % 2 == 0) {
                k++;
            }
        }
        System.out.println("k = " + k + " ta");
        System.out.print("b[i] : ");
        int[] b = new int[k];
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[t] = a[i];
                System.out.print(b[t] + " ");
            }
        }

    }
}
