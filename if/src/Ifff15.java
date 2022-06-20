import java.util.Scanner;

public class Ifff15 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a, b, c;
        a = kirit.nextInt();
        b = kirit.nextInt();    //  32 65 23
        c = kirit.nextInt();   //
        if ((a + b) > (b + c) || (a + b) > (a + c)) {
            System.out.println(a);
        } else if ((b + c) > (a + c) || (b + c) > (b + a)) {
            System.out.println(b);
        } else if ((a+c)>(b+a) || (a+c)>(b+c));
        System.out.print(c);
    }
}
