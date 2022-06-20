import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int a,b,c;
        float x1,x2,d;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        d=b*b-4*a*c;
        check = d>0;
        System.out.println(check);
    }


}
