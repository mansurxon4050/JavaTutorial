import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        int b = kirit.nextInt();
        int s=0;
        for (int i = a; i <b; i++) {
            s=s+i*i;

        }
        System.out.println(s);

    }
}
