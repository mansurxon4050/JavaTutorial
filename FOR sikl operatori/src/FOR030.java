import java.util.Scanner;

public class FOR030 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,n;
        a= kirit.nextInt();
        b= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = a; i <= b; i+=n) {

            System.out.print(1-Math.sin(i) + "   " );
        }
    }
}
