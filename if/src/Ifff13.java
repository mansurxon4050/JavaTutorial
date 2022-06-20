import java.util.Scanner;

public class Ifff13 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        if (a>b && b>c || a<b && b<c){
            System.out.println(b);
        } else if (b>a && a>c || b<a && a<c){
            System.out.println(a);
        } else if (a>c && c>b || a<c && c<b){
            System.out.println(c);
        } else {
            System.out.println("xato");
        }


    }
}
