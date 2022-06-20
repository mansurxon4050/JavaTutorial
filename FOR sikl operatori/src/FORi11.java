import java.util.Scanner;

public class FORi11 {
    public static void main(String[] args) {
        Scanner kirit =new Scanner(System.in);
        int n,s=0;
        n= kirit.nextInt();
        for (int i = 0; i <=n ; i++) {
            s+=(i+1)*(i+1);
        }
        System.out.println(s); // 1+4+9+16=30
        
        
    }
}
