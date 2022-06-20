import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int x,y,x1,y1,x2,y2;
        x= kirit.nextInt();
        y= kirit.nextInt();
        x1= kirit.nextInt();
        y1= kirit.nextInt();
        x2= kirit.nextInt();
        y2= kirit.nextInt();
        check = x<x2 && x>x1 && y>y2 && y<y1;
        System.out.println(check);




    }


}
