         import java.util.Scanner;
         public class FOR23 {
             public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float n,x,c;
        float s,k=1;
        n= kirit.nextInt();
        x= kirit.nextInt();
        c=x;
        s=x;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i + 1; j++) {
            k*=j;
            x*=x;
            }
            s+=(x / c) / k;
            System.out.println(s);
               }
                 System.out.println(s + " yigindisi");
             }
          }


