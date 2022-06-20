import java.util.Scanner;

public class boolean4 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        boolean check = a > 2;
        boolean check1 = b < 3;
        System.out.println("a > 2" + check);
        System.out.println("a < 3 " + check1);

    }
}
