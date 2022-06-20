import java.util.Scanner;

public class IF8 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        if (a-b>0 ){
            System.out.println(+ a +" katta");
            System.out.println(+b+ " kichik");
        } else if (a-b<0 ){
            System.out.println(+ b +" katta");
            System.out.println(+ a + " kichik");
        }
    }
}
