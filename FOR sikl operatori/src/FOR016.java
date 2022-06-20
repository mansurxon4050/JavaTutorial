import java.util.Scanner;

public class FOR016 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,n,k=1;
        a= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            k*=a;
            System.out.println(k);
        }
    }
    }
