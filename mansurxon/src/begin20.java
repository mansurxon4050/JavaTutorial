import java.util.Scanner;

public class
begin20 {
    public static void main(String[] args) {    // bu begin 21 ekan
        Scanner kirit = new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3,p;
        x1= kirit.nextInt();                                   //x1;y1
        y1= kirit.nextInt();                          // a                   c
        x2= kirit.nextInt();
        y2= kirit.nextInt();                            //x2;y2                  x3;y3
        x3= kirit.nextInt();                                       //b
        y3= kirit.nextInt();
        int a = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        int b = (int) Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        int c = (int) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        System.out.println("p=" + (a+b+c));
        p=(a+b+c);
        System.out.println("s=" + Math.sqrt(p*(p-a)*(p-b)*(p-c)));



    }
}
