import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt(),k=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 1; i < n ; i++) {
            if (a[i] % 2 == 0 && a[i - 1] % 2 == 1 || a[i] % 2 == 1 && a[i - 1] % 2 == 0) {
                k++;
            }else {
                System.out.println(i+"=indeksdagi "+a[i]+" son ketma ketlikni buzdi !");
                break;
            }
            if (k==n-1) System.out.println(0);
        }
    }
}
