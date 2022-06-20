import java.util.Scanner;

public class FOR0000 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1 || j==n ||i==n-j+1 && i<=(n/2)+1 || i==j && i<=(n/2)+1 )
                    System.out.print(" M ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
