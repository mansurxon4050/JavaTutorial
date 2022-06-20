import java.util.Scanner;

public class FOR13 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt();
        float s=0;
        for (float i = 1.1f; i <=n ; i+=0.1) {
            s+=i;
        } System.out.println(s);
    }
}
