import java.util.Scanner;

public class massiv42 { // 42
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kirit.nextInt();
        }
        int k,l=0;
        for (int i = 0; i < n; i++) {
            k=0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] != a[j]) {
                    k++;
                }
            }
            if (k==n-i-1){
                l++;
            }
        }
        System.out.print(l);
    }
}
// 1 2 3 4 5 6 7 8 9

