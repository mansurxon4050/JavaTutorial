import java.util.Scanner;

public class FOR031 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n = kirit.nextInt();
        float a = 2;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {

            a = 2 + 1 / a;
            System.out.print(a + "  ");
        }
    }
}
//A0=2
//A1=2+1/2=2.5
//A2=2+1/2.5=2.4
//A3=