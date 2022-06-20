import java.util.Scanner;

public class begin37 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int v1,v2,s,t,h;
        v1= kirit.nextInt();
        v2= kirit.nextInt();
        s= kirit.nextInt();
        t= kirit.nextInt();
        h=s-v1*t+v2*t;
        System.out.println(h);
    }
}
