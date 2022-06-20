import java.util.Scanner;

public class SWITCH12 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt(),b= kirit.nextInt();
        switch (a){
            case 1->{
                System.out.println("D=" + 2*b);
                System.out.println("L=" + 2*3.14*b);
                System.out.println("S=" + 3.14*b*b);
            }case 2->{System.out.println("R=" + b/2);
                System.out.println("L=" + 3.14*b);
                System.out.println("S=" + 3.14*b*b/4);
            }
        }
    }
}
