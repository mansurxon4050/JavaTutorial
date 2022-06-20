import java.util.Scanner;

public class Stringg27 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        String st1 = kirit.nextLine();
        String st2 = kirit.nextLine();
        int n1= kirit.nextInt();
        int n2= kirit.nextInt();
        String newst1 = st1.substring(0,n1);
        String newst2 = st2.substring(st2.length()-n2);
        System.out.println(newst1.concat(newst2));


    }
}