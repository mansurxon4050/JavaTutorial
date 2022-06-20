import java.util.Scanner;

public class SWITCH13 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a= kirit.nextInt(),b= kirit.nextInt();
        switch (a){
            case 1->{
                System.out.println("c=" + b*Math.sqrt(2));
                System.out.println("h=" + (b*Math.sqrt(2))/2);
                System.out.println("S=" + ((b*Math.sqrt(2))/2)*b/2*Math.sqrt(2));
            }case 2->{
                System.out.println("a=" + b/(Math.sqrt(2)));
                System.out.println("h=" + b/2*(Math.sqrt(2)));
                System.out.println("S=" + b/2*(Math.sqrt(2))*b/(Math.sqrt(2)));
            }default -> System.out.println("xato");
        }
    }
}
