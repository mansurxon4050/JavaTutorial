import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k=1,n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            k+=2;
            a[i] = k;
        }
        for (int i = 1; i < n; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
