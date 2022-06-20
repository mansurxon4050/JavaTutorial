import java.util.Scanner;

public class FOR021 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        float n= kirit.nextInt(),k=1,s=0;
        for (float i = 1; i <=n ; i++) {
            k*=i;
            s+=1/k;
        }
        System.out.println(s + "yig");

    }
}
