import java.util.Scanner;

public class FOR014 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt(),s=0;
        for (int i = 1; i <= n; i++) {
            s+=(2*i-1);

        }
        System.out.println(s);
    }
}
