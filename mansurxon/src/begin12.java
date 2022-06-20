import java.util.Scanner;

public class begin12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float a, b,c;
        a=kirit.nextInt();
        b=kirit.nextInt();
        c= (float) Math.sqrt(a*a+b*b);
        System.out.println("c=" + Math.sqrt(a*a+b*b));
        System.out.println("P=" + (a+b+c));

    }
}
