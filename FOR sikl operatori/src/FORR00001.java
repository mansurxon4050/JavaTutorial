import java.util.Scanner;

public class FORR00001 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1+n/2; j++) {
                if (j==1 || i==n/2-j+2 || i==n/2+j)
                    System.out.print(" K ");
                else
                    System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
