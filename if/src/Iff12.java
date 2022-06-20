import java.util.Scanner;

public class Iff12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();  //
        if (a>c && b>c ){
            System.out.println(c);
        } else if (a<b && a<c){
            System.out.println(a);
        } else if(a>b && c>b) {
            System.out.println(b);
        }
    }
}
