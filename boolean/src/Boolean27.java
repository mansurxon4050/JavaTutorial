import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        check = a>0 && b>0 || a<0 && b<0;
        System.out.println(check);
    }



}
