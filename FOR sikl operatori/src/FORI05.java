import java.util.Scanner;

public class FORI05 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        for (float i = 0.1f; i <= 1; i+=0.1) {
            System.out.println(i+ "kg= " + i*a + " som" );
        }
    }
}
