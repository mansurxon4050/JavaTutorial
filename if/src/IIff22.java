import java.util.Scanner;

public class IIff22 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int x,y;
        x= kirit.nextInt();
        y= kirit.nextInt();
        if (x>0 && y>0){
            System.out.println("1 chorak");
        } else if (x<0 && y>0){
            System.out.println("2 chorak");
        }else if (x<0 && y<0){
            System.out.println("3 chorak");
        } else{
            System.out.println("4 chorak");
        }
    }

}
