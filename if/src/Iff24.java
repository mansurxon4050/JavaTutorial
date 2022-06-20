import java.util.Scanner;

public class Iff24 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x;
        x= kirit.nextInt();
        if (x>0){
            System.out.println(2*Math.sin(x));
        } else {
            System.out.println((x-6));
        }

    }
}
