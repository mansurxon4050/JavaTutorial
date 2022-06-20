import java.util.Scanner;

public class FOR5 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        int b = kirit.nextInt();
        for (float i = 0.1f; i <=b; i+=0.1) {

                System.out.println(i+ "kg=" + i*a + "so'm");

        }

    }
}
