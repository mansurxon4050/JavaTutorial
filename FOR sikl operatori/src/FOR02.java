import java.util.Scanner;

public class FOR02 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,k=0;
        a= kirit.nextInt();
        b= kirit.nextInt();
        for (int i = a; i <= b; i++) {
            k++;
            System.out.println(i);

        }
        System.out.println(k + " ta");

    }
}
