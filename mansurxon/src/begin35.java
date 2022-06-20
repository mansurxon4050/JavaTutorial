import java.util.Scanner;

public class begin35 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int v,u,t1,t2,s1,s2;
        v= kirit.nextInt();
        u= kirit.nextInt();
        t1= kirit.nextInt();
        t2= kirit.nextInt();
        s1=(v+u)*t1;
        s2=(v-u)*t2;
        System.out.println("oqim bo'yicha s1=" +s1 + "km/soat");
        System.out.println("oqim qarshi s2=" +s2 + "km/soat");


    }

}
