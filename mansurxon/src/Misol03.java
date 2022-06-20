import java.util.Scanner;

public class Misol03 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        int s=0,k;
        for (int i = 1; i <= n; i++) {
            k=1;                             //    n = 4
            for (int j = i; j <= n; j++) {  //  1  +  2*2*2 + 3*3 +4 =22
                k*=i;

            }
            s+=k;
        }
        System.out.println(s);
    }
}
