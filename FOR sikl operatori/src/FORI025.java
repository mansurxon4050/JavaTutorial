import java.util.Scanner;
public class FORI025 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        float x = kirit.nextInt(), s = 0, k = 1;
        if (Math.abs(x) < 1) {
            for (int i = 1; i <= n; i++) {
                k *= x;
                s += k / i;
                System.out.println(s);
            }
        }
    }
}
