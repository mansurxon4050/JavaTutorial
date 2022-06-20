import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b;
        a= kirit.nextInt();
        b= kirit.nextInt();
        if (a!=b ){
            System.out.println(+ (a+b) +" yigindisi");
        } else if (a==b ){
            System.out.println(0);

        }
    }

}
