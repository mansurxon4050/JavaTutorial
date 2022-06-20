import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        if (a>b ){
            System.out.println(+ b +" kichik");
            System.out.println(+ a +" katta");
        } else if (a<b ){
            System.out.println(+ a +" kichik");
            System.out.println(+ b +" katta");

        }
    }
}
