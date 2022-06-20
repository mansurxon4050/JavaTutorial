import java.util.Scanner;

public class FORR38 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt(), k = 1, s = 0;
        for (int i = 1; i <= n; i++) {
            k = 1;
            for (int j = 0; j <= i - j; j++) {
                k*=i;
            }
            System.out.println(k);
        }

    }
}
