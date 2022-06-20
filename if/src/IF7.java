import java.util.Scanner;

public class IF7 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        if (a-b>0 ){
            System.out.println(+ b +"(2 kichik)");
        } else if (a-b<0 ){
            System.out.println(+ a +"(1 kichik)");

        }
    }
}
