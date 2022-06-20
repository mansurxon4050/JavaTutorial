import java.util.Scanner;

public class FOR07 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,s=0;
        a= kirit.nextInt();
        b= kirit.nextInt();
        for (int i = a; i < b; i++) {
            s+=i;
        }
        System.out.println(s);

    }
}
