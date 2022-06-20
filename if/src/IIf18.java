import java.util.Scanner;

public class IIf18 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a,b,c;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        if (a==b){
            System.out.println(3);
        }else if (a==c){
            System.out.println(2);
        } else if (b==c){
            System.out.println(1);
        }


    }
}
