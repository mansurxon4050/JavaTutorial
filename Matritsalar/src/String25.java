import java.util.Scanner;
public class String25 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int  k, n = kirit.nextInt();
        String str="";
        while (n >= 2) {
            k = n % 2;
            n = n / 2;

            str=String.valueOf(k).concat(str);
        }
        str=String.valueOf(n).concat(str);
        System.out.println(str);
    }
}
