import java.util.Scanner;

public class FOR012 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float n,k=1;
        n= kirit.nextInt();
        for (float i = 1.1f; i <= n; i+=0.1) {
            k*=i;
            System.out.println(k);
        }
    }
}
