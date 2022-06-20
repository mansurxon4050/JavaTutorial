import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner mansurxon = new Scanner(System.in);
        int n=mansurxon.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((char)(i)+" ");
            if (i%50==0)
                System.out.println();
        }
    }
}
