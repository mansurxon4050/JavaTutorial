import java.util.Scanner;

public class FOR18 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n,a,k=1,s=1;
        a= kirit.nextInt();
        n= kirit.nextInt();
        for (int i = 0; i < n; i++) {
            k *= -a;
            s = s + k;
            System.out.print(" "+ k + " ");
        }System.out.println(" " + (1- s) + " yigindisi");


    }
}
