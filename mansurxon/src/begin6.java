import java.util.Scanner;

public class begin6 {
    public static void main(String[] args) {
        Scanner kirit= new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        System.out.println("v=" +a*b*c);
        System.out.println("s=" +2*(a*b+b*c+a*c));
    }
}
