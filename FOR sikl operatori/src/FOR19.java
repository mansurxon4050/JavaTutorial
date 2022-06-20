import java.util.Scanner;

public class FOR19 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int k=1,n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            k*=i;
        }
        System.out.println(k);

    }
}
