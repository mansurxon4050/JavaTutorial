import java.util.Scanner;

public class FOR37 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt(), k, s = 0;
        for (int i = 1; i <= n; i++) {
            k = 1;

            for (int j = 1; j <= i; j++) {
                k *= i;
            }
            s += k;
        }
        System.out.println(s);
    }
}
