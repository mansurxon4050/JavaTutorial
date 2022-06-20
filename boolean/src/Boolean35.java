import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        boolean check;
        int x1,y1,x2,y2;
        x1= kirit.nextInt();
        y1= kirit.nextInt();
        x2= kirit.nextInt();
        y2= kirit.nextInt();
        check = (x1+y1)%2==1 && (x2+y2)%2==1||(x1+y1)%2==0 && (x2+y2)==0;
        System.out.println(check);
    }


}
