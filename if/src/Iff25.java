import java.util.Scanner;

public class Iff25 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x;
        x= kirit.nextInt();
        if (x>2 || x<-2){
            System.out.println(2*x);
        }else{
            System.out.println(-3*x);
        }

    }

}
