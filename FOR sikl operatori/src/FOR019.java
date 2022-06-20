import java.util.Scanner;

public class FOR019 {
    public static void main(String[] args) {
        Scanner kirit =new Scanner(System.in);
        int n,k=1;
        n= kirit.nextInt();
        for (int i = 1; i <= n; i++) {
            k*=i;
            System.out.println(k);
        }
    }
}
