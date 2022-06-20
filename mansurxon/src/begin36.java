import java.util.Scanner;

public class begin36 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int v1,v2,s,t,h;
        v1= kirit.nextInt();
        v2= kirit.nextInt();
        s= kirit.nextInt();
        t= kirit.nextInt();
        h=v1*t+v2*t+s;
        System.out.println(h);
    }

}
