import java.util.Scanner;

public class integer14 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        System.out.println(a/100+(a%10)*100+((a%100)/10)*10);

    }

}
