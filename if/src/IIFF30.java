import java.util.Scanner;

public class IIFF30 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        if (a%10<10 && a%2==0){
            System.out.println("2xonali juft son");
        } else if (a%10<10 && a%2==1){
            System.out.println("2 xonali toq son");
        } else if (a%100<100 && a%2==0){
            System.out.println("3 xonali juft son");
        } else if (a%100<100 && a%2==1){
            System.out.println("3 xonali toq son");
        }else if (a==0){
            System.out.println(0);
        }else if (a<0){
            System.out.println("manfiy son");
        }

    }
}
