import java.util.Scanner;

public class begin17 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        System.out.println("ab=" + Math.abs(a-b));
        System.out.println("bc" + Math.abs(b-c));
        System.out.println("yigindi"+(Math.abs(a-b)+Math.abs(b-c)));

    }
}
