import java.util.Scanner;

public class FOR020 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n= kirit.nextInt(),k=1,s=0;
        for (int i = 1; i <=n ; i++) {
            k*=i;
            s+=k;


        }
        System.out.println(s + "yig");
    }
 }
