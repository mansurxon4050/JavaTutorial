import java.util.Scanner;

public class FOR16 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,n,k=1;
        a = kirit.nextInt();
        n = kirit.nextInt();
        for (int i = 0; i < n; i++) {
            k *= a;
            System.out.print(k + "  ");
        }
    }
}