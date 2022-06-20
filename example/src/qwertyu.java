import java.util.Scanner;

public class qwertyu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b) {

            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
        }
        System.out.println("b : "+ b );

    }
}
