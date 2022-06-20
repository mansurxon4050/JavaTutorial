import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k = kirit.nextInt(), n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i%k==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
