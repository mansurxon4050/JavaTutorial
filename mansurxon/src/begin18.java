import java.util.Scanner;

public class begin18 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        System.out.println("aс=" + Math.abs(a-c));
        System.out.println("bc=" + Math.abs(b-c));
        System.out.println( "ac*bc="+ Math.abs(a-c)*Math.abs(b-c));

    }
}
