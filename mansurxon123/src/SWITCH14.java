import java.util.Scanner;

public class SWITCH14 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a=kirit.nextInt(),b=kirit.nextInt(); //  Math.sqrt(3)=1.73
        switch (a){
            case 1->{
                System.out.println("R1=" + (b*1.73)/6);
                System.out.println("R2=" + (b*1.73)/3);
                System.out.println("S=" + (b*b*1.73)/4);
            } case 2->{
                System.out.println("a=" + (b*6)/1.73);
                System.out.println("R2=" + 2*(b*6)/1.73);
                System.out.println("S=" + 2*(b*b*36)/(1.73*1.73));
            }

        }
    }
}
