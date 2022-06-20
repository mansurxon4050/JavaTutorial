import java.util.Scanner;

public class FOR12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        float k=1;
        for (float i = 1.1f; i <=n ; i+=0.1) {
            k=k*i;
        }
        System.out.println(k);

    }
}
