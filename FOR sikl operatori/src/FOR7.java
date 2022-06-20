import java.util.Scanner;

public class FOR7 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt();
        int b = kirit.nextInt();
        int s=0;
        for (int i = a; i <b; i++) {
              s+=i;

        }
        System.out.println(s);

    }
}
