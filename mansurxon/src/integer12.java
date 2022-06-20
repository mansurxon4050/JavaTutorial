import java.util.Scanner;

public class integer12 {
    public static void main(String[] args) {
        Scanner kirit= new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        System.out.println(a/100+(a/10)%10*10+(a%100)%10*100);
        System.out.println(a/100);
        System.out.println((a/10)%10);
        System.out.println((a%100)%10);
    }

}
