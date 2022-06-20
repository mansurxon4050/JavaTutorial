import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        if (c==1){
            System.out.println("a+b=" + a+b);
        } else if (c==2){
            System.out.println("a-b=" + (a-b));
        } else if (c==3 ){
            System.out.println("a/b=" + a/b);
        } else if (c==4) {
            System.out.println("a*b=" + a*b);
        }
        else {
            System.out.println("xato ");
        }
    }
}
