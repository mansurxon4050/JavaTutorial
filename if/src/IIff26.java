import java.util.Scanner;

public class IIff26 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x;
        x= kirit.nextInt();
        if (x<=0){
            System.out.println(-x);
        } else if (x>0 && x<2){
            System.out.println(x*x);
        }else if (x>=2){
            System.out.println(4);
        }


    }

}
