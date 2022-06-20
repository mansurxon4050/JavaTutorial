import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,n,k=1,s=0;
        a= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = 0; i < n; i++) {
            k *= a;
            s += k;
            System.out.print(" "+ k + " ");
        }System.out.println("  " + s + " yigindisi");

    }
}
