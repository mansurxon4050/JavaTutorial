import java.util.Scanner;

public class FOR6 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        int b = kirit.nextInt();
        for (float i = 1.2f; i <=b; i+=0.2) {

            System.out.println(i+ "kg=" + i*a + "so'm");

        }

    }
}
