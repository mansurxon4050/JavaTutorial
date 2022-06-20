import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int x,y;
        x= kirit.nextInt();
        y= kirit.nextInt();
        check = (x+y)%2==1;
        System.out.println(check);
    }


}
