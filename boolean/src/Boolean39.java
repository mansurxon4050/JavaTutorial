import java.util.Scanner;

public class Boolean39 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int x1,y1,x2,y2;
        x1= kirit.nextInt();
        y1= kirit.nextInt();
        x2= kirit.nextInt();
        y2= kirit.nextInt();
        check = x1==x2 || y1==y2 || Math.abs(x2-x1)==Math.abs(y2-y1);
        System.out.println(check);
    }


}
