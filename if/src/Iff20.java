import java.util.Scanner;

public class Iff20 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        if (Math.abs(a-b)<Math.abs(a-c) ){
            System.out.println(b);
        }else {
            System.out.println(00);
        }
    }
    }
