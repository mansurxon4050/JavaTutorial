import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int a,b,c,d;
        a= kirit.nextInt();
        b=a/100;
        c=(a/10)%10;
        d=a%10;
        check = b!=c && b!=d && c!=d;
        System.out.println(check);
    }


}
