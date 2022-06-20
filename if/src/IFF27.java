import java.util.Scanner;

public class IFF27 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x;
        x= kirit.nextInt();
        if (x<0){
            System.out.println(0);
        }else if (x%2==0 || x==0){
            System.out.println(1);
        }else if (x==1 || x%2==1){
            System.out.println(-1);
        }

    }
}
