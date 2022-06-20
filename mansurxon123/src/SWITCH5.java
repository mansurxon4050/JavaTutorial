import java.util.Scanner;

public class SWITCH5 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        switch (c){
            case 1:
                System.out.println("a+b=" + (a+b));
                break;
            case 2:
                System.out.println("a-b=" + (a-b));
                break;
            case 3:
                System.out.println("a/b=" + a/b);
                break;
            case 4:
                System.out.println("a*b=" + a*b);
            default:
                System.out.println("xato");

        }
    }
}
