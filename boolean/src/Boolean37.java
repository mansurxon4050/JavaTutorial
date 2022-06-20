import java.util.Scanner;

public class Boolean37 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int x1,y1,x2,y2;
        x1= kirit.nextInt();
        y1= kirit.nextInt();
        x2= kirit.nextInt();
        y2= kirit.nextInt();
        check = Math.abs(x1-x2)<=1 && Math.abs(y1-y2)<=1;
        System.out.println(check);
    }


}
