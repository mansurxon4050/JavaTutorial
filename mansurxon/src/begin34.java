import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class begin34 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x, a, y, b, d, e;
        x = kirit.nextInt();
        a = kirit.nextInt();
        y = kirit.nextInt();
        b = kirit.nextInt();
        d = a / x;
        e = d / b;
        System.out.println(d - e);
    }
}
