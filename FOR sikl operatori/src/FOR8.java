import java.util.Scanner;

public class FOR8 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        int b = kirit.nextInt();
        int k=1;
        for (int i = a; i <=b; i++) {
            k*=i;

        }
        System.out.println(k);

    }
}
