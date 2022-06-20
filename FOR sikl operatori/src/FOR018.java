import java.util.Scanner;

public class FOR018 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,n,k=1,s=0;
        a= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = 0; i <= n; i++) {
            k*=-a;
            System.out.print(k + " ");
            s+=k;

        }
        System.out.println(1-s);

    }
}
