import java.util.Scanner;

public class IIfff16 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
       int a,b,c;
       a= kirit.nextInt();
       b= kirit.nextInt();
       c= kirit.nextInt();
       if (a<b && b<c ){
           System.out.println(2*a*b*c);
       } else {
           System.out.println(-a);
           System.out.println(-b);
           System.out.println(-c);
       }
    }
}
