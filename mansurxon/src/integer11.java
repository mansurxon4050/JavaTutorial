import java.util.Scanner;

public class integer11 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b=a/100+(a/10)%10+(a%100)%10;
        System.out.println(+b);

    }

}
