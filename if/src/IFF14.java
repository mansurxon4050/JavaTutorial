import java.util.Scanner;

public class IFF14 {
    public static void main(String[] args) {
        Scanner kirit =new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        if (a>b && b>c || a<b && b>c){
            System.out.println(c);
            System.out.println();
        } else if ( b<a && a<c ||b>a && a>c){
            System.out.println(a);
        } else if (a>b && c>b || a<c && c<b){
            System.out.println(b);
        } else {
            System.out.println("xato");
        }
    }
}
