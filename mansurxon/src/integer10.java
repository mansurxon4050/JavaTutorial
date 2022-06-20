import java.util.Scanner;

public class integer10 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        System.out.println("birliklar xonasi" +(a%100)%10);
        System.out.println("onliklar xonasi" +(a/10)%10);

    }

}
