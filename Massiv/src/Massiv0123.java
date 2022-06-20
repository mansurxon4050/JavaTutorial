import java.util.Scanner;

public class Massiv0123 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        int k, l = 0, p = 0;
        for (int i = 0; i < n; i++) {
            k = 0;
            for (int j = i; j < n; j++) {
                if (a[i] == a[j]) {
                    k++;
                }
                if (k == 2) {
                    l = i;
                    p = j;
                    // System.out.println(a[l]+" "+a[p]);
                }
            }
        }
        System.out.print(l + " " + p + " indeksdagilar");
    }
}
