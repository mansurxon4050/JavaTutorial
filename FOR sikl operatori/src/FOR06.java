import java.util.Scanner;

public class FOR06 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        for (float i = 1.2f; i <= 2; i+=0.2) {
            System.out.println(i+ "kg= " + i*a + " som" );
        }
    }
}
