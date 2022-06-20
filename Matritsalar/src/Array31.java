import Lenovo.Form;

import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        int k = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (a[i] > a[i - 1]) {
                k++;
                System.out.print(a[i] + " ");
            }

        }
        System.out.println(k+" ta");
    }
}
