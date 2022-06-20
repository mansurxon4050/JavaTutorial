import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a1,b1,c1,a2,b2,c2,x,y,d;
        a1= kirit.nextInt();
        b1= kirit.nextInt();
        a2 = kirit.nextInt();
        b2 = kirit.nextInt();
        c1= kirit.nextInt();
        c2= kirit.nextInt();
        d=(a1*b2-a2*b1);
        x=(c1*b2-c2*b1)/d;
        y=(a1*c2-a2*c1)/d;
        System.out.println(x);
        System.out.println(y);
    }


}
