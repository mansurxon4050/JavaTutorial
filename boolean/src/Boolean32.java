import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        check = c==Math.sqrt(a*a+b*b);
        System.out.println(check);
    }


}
