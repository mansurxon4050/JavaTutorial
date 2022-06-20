import java.util.Scanner;

public class Misol00 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 0; i < n; i+=2) {
            System.out.print(a[i] + " ");
        }
    }
}


