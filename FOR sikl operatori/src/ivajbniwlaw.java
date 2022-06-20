import java.util.Scanner;

public class ivajbniwlaw<fori> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j == n / 2) {
                    System.out.print(" I ");
                } else System.out.print(" * ");
            }
            System.out.println();
        }

        Scanner kirit = new Scanner(System.in);
        int k = kirit.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0 || i==n-1){
                    System.out.print(" M ");
                }else System.out.print(" * ");
            }
            System.out.println();
        }
        Scanner mansurxon = new Scanner(System.in);
        
    }
}
