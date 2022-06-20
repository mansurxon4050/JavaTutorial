import java.util.Scanner;

public class integer29 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c,d;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        d=(a*b)/(c*c);
        System.out.println("joylash mumkin bulgan kvadratlar soni=" + d +"metr kvadrat");
        System.out.println("joylashmay qolgan qismi =" + (a*b)%(c*c) + "metr kvadrat");


    }
}
