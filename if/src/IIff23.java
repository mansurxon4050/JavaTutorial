import java.util.Scanner;

public class IIff23 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        x1=kirit.nextInt();
        y1=kirit.nextInt();
        x2=kirit.nextInt();
        y2=kirit.nextInt();
        x3=kirit.nextInt();
        y3=kirit.nextInt();
        if (x2>0 && y2>0 &&x3<0 && y3<0){
            System.out.println(x2 + ";" + y3);
        } else{
            System.out.println("xato");
        }

    }
}
