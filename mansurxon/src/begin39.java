import java.util.Scanner;

public class begin39 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
       float a,b,c,x1,x2,d;
        a= kirit.nextInt();
        b= kirit.nextInt();
        c= kirit.nextInt();
        d=b*b-4*a*c;
        x1= (float) ((-b+Math.sqrt(d))/2*a);
        x2= (float) ((-b-Math.sqrt(d))/2*a);
        System.out.println("x1 =" + x1);
        System.out.println("x2 =" + x2);



    }

}
