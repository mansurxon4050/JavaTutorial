import java.util.Scanner;

public class begin21 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float a,b,c,d;             // x1=a,y1=b,x2=c,y2=d
        a= kirit.nextInt();
        b= kirit.nextInt();        // bu begin 20 ekan almashib qolbdi
        c= kirit.nextInt();
        d= kirit.nextInt();
        System.out.println(Math.sqrt((c-a)*(c-a)+(d-b)*(d-b)));
    }


}
