import java.util.Scanner;

public class FOR017 {
    public static void main(String[] args) {
        Scanner kirit =new Scanner(System.in);
        int a,n,s=0,k=1;
        a= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            k*=a;
            s+=k;
            System.out.println(k);
        }
        System.out.println(s);
    }
}
