import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k = 0, n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            System.out.print(a[i]+" "+a[i+1]+" "+a[n-i-1]+" "+a[n-i-2]+" ");
            i++;
        }
    }
}
