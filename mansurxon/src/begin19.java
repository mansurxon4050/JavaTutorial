import java.util.Scanner;

public class begin19 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x1,y1,x4,y4;
        x1= kirit.nextInt();   // x1;y1      x3;y3        x1=x2   y1=y3
        y1= kirit.nextInt();   // x2;y2      x4;y4        x3=x4   y2=y4  qarama qarshi uchlari berilgan bulsa
        x4= kirit.nextInt();
        y4= kirit.nextInt();
        System.out.println("eni=" +Math.abs(x1-x4));
        System.out.println("bo'yi=" +Math.abs(y1-y4));
        System.out.println("peremetr=" + (Math.abs(x1-x4)+Math.abs(y1-y4))*2);
        System.out.println("yuzasi=" +Math.abs(x1-x4)*Math.abs(y1-y4) );



    }
}
