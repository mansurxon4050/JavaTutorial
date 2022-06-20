import java.util.Scanner;

public class Boolean18 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        check = a==b || b==c || a==c;
        System.out.println(check);


    }
}
