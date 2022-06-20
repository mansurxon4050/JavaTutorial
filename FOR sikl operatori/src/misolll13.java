import java.util.Scanner;

public class misolll13 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a = kirit.nextInt();
        if (a > 0 && a < 9) {
            if (a % 2 == 0)
                System.out.println(" bir xonali juft son");
            else System.out.println("bir xonali toq son");
        } else if (a < 100) {
            if (a % 2 == 0) System.out.println("ikkki xonali juft son");
            else System.out.println(" ikki xonali toq son");
        } else if (a < 1000) {
            if (a % 2 == 0) System.out.println("uch xonali juft son");
            else System.out.println("uch xonali toq son");
        }

    }
}
