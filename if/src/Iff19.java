import java.util.Scanner;

public class Iff19 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c,d;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        d= kirit.nextInt();
        if (a==b && b==c){
            System.out.println(4);
        } else if (a==b && b==d){
            System.out.println(3);
        } else if (a==c && c==d){
            System.out.println(2);
        } else if (b==c && c==d){
            System.out.println(1);
        } else {
            System.out.println(000);
        }
    }
}
