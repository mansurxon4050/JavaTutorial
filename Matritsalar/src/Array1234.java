import java.util.Scanner;

public class Array1234 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int  n = kirit.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2 * n];
        int t=0;
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
            c[t++] = a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = kirit.nextInt();
            c[t++] = b[i];
        }
        int k ;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = i+1; j < 2 * n; j++) {
                if (c[i] > c[j]) {
                    k = c[i];
                    c[i]=c[j];
                    c[j]=k;
                }
            }
            System.out.print(c[i]+" ");
        }

    }
}
