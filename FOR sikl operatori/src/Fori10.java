import java.util.Scanner;

public class Fori10 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        float s=0;
        for (float i = 1; i <=n ; i++) {
            s = s + 1 / i;

        }
            System.out.println(s);



    }
}
