import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        int k = kirit.nextInt();
        int l = kirit.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= kirit.nextInt();
        }
        int s=0;
        for (int i = k; i <= l ; i++) {
            s+=a[i];

        }
        System.out.println(s+"yigindisi");
    }
}
