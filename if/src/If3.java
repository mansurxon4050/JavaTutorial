import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        if (a>0){
            System.out.println("musbat" + (a+1));
        } else if (a<0){
            System.out.println("manfiy" + (a-2) );
        } else {
            System.out.println(a=10);
        }
    }
}
