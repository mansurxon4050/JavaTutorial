import java.util.Scanner;

public class IIFF29 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int a;
        a= kirit.nextInt();
        if (a%2==1 && a>0){
            System.out.println("musbat toq son");
        } else if (a%2==0 && a<0){
            System.out.println("manfiy juft son");
        } else if (a==0){
            System.out.println(0);
        }else if (a%2==0 && a>0){
            System.out.println("musbat juft son");
        } else if (a%2==1 && a<0){
            System.out.println("manfiy toq son");
        }


    }
}
