import java.util.Scanner;

public class FOR08 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,k=1;
        a= kirit.nextInt();
        b= kirit.nextInt();
        for (int i = a; i < b; i++) {
            k*=i;
            System.out.println(k);
        }
        System.out.println(k);
    }
}
